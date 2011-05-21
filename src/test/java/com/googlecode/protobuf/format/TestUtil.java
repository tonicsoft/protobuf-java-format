// Protocol Buffers - Google's data interchange format
// Copyright 2008 Google Inc.  All rights reserved.
// http://code.google.com/p/protobuf/
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
//     * Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
//     * Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
//     * Neither the name of Google Inc. nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
package com.googlecode.protobuf.format;


import protobuf_unittest.UnittestProto;

// The static imports are to avoid 100+ char lines.  The following is roughly equivalent to
// import static protobuf_unittest.UnittestProto.*;
import static protobuf_unittest.UnittestProto.defaultInt32Extension;
import static protobuf_unittest.UnittestProto.defaultInt64Extension;
import static protobuf_unittest.UnittestProto.defaultUint32Extension;
import static protobuf_unittest.UnittestProto.defaultUint64Extension;
import static protobuf_unittest.UnittestProto.defaultSint32Extension;
import static protobuf_unittest.UnittestProto.defaultSint64Extension;
import static protobuf_unittest.UnittestProto.defaultFixed32Extension;
import static protobuf_unittest.UnittestProto.defaultFixed64Extension;
import static protobuf_unittest.UnittestProto.defaultSfixed32Extension;
import static protobuf_unittest.UnittestProto.defaultSfixed64Extension;
import static protobuf_unittest.UnittestProto.defaultFloatExtension;
import static protobuf_unittest.UnittestProto.defaultDoubleExtension;
import static protobuf_unittest.UnittestProto.defaultBoolExtension;
import static protobuf_unittest.UnittestProto.defaultStringExtension;
import static protobuf_unittest.UnittestProto.defaultBytesExtension;
import static protobuf_unittest.UnittestProto.defaultNestedEnumExtension;
import static protobuf_unittest.UnittestProto.defaultForeignEnumExtension;
import static protobuf_unittest.UnittestProto.defaultImportEnumExtension;
import static protobuf_unittest.UnittestProto.defaultStringPieceExtension;
import static protobuf_unittest.UnittestProto.defaultCordExtension;

import static protobuf_unittest.UnittestProto.optionalInt32Extension;
import static protobuf_unittest.UnittestProto.optionalInt64Extension;
import static protobuf_unittest.UnittestProto.optionalUint32Extension;
import static protobuf_unittest.UnittestProto.optionalUint64Extension;
import static protobuf_unittest.UnittestProto.optionalSint32Extension;
import static protobuf_unittest.UnittestProto.optionalSint64Extension;
import static protobuf_unittest.UnittestProto.optionalFixed32Extension;
import static protobuf_unittest.UnittestProto.optionalFixed64Extension;
import static protobuf_unittest.UnittestProto.optionalSfixed32Extension;
import static protobuf_unittest.UnittestProto.optionalSfixed64Extension;
import static protobuf_unittest.UnittestProto.optionalFloatExtension;
import static protobuf_unittest.UnittestProto.optionalDoubleExtension;
import static protobuf_unittest.UnittestProto.optionalBoolExtension;
import static protobuf_unittest.UnittestProto.optionalStringExtension;
import static protobuf_unittest.UnittestProto.optionalBytesExtension;
import static protobuf_unittest.UnittestProto.optionalGroupExtension;
import static protobuf_unittest.UnittestProto.optionalNestedMessageExtension;
import static protobuf_unittest.UnittestProto.optionalForeignMessageExtension;
import static protobuf_unittest.UnittestProto.optionalImportMessageExtension;
import static protobuf_unittest.UnittestProto.optionalNestedEnumExtension;
import static protobuf_unittest.UnittestProto.optionalForeignEnumExtension;
import static protobuf_unittest.UnittestProto.optionalImportEnumExtension;
import static protobuf_unittest.UnittestProto.optionalStringPieceExtension;
import static protobuf_unittest.UnittestProto.optionalCordExtension;

import static protobuf_unittest.UnittestProto.repeatedInt32Extension;
import static protobuf_unittest.UnittestProto.repeatedInt64Extension;
import static protobuf_unittest.UnittestProto.repeatedUint32Extension;
import static protobuf_unittest.UnittestProto.repeatedUint64Extension;
import static protobuf_unittest.UnittestProto.repeatedSint32Extension;
import static protobuf_unittest.UnittestProto.repeatedSint64Extension;
import static protobuf_unittest.UnittestProto.repeatedFixed32Extension;
import static protobuf_unittest.UnittestProto.repeatedFixed64Extension;
import static protobuf_unittest.UnittestProto.repeatedSfixed32Extension;
import static protobuf_unittest.UnittestProto.repeatedSfixed64Extension;
import static protobuf_unittest.UnittestProto.repeatedFloatExtension;
import static protobuf_unittest.UnittestProto.repeatedDoubleExtension;
import static protobuf_unittest.UnittestProto.repeatedBoolExtension;
import static protobuf_unittest.UnittestProto.repeatedStringExtension;
import static protobuf_unittest.UnittestProto.repeatedBytesExtension;
import static protobuf_unittest.UnittestProto.repeatedGroupExtension;
import static protobuf_unittest.UnittestProto.repeatedNestedMessageExtension;
import static protobuf_unittest.UnittestProto.repeatedForeignMessageExtension;
import static protobuf_unittest.UnittestProto.repeatedImportMessageExtension;
import static protobuf_unittest.UnittestProto.repeatedNestedEnumExtension;
import static protobuf_unittest.UnittestProto.repeatedForeignEnumExtension;
import static protobuf_unittest.UnittestProto.repeatedImportEnumExtension;
import static protobuf_unittest.UnittestProto.repeatedStringPieceExtension;
import static protobuf_unittest.UnittestProto.repeatedCordExtension;

import static protobuf_unittest.UnittestProto.OptionalGroup_extension;
import static protobuf_unittest.UnittestProto.RepeatedGroup_extension;

import static protobuf_unittest.UnittestProto.packedInt32Extension;
import static protobuf_unittest.UnittestProto.packedInt64Extension;
import static protobuf_unittest.UnittestProto.packedUint32Extension;
import static protobuf_unittest.UnittestProto.packedUint64Extension;
import static protobuf_unittest.UnittestProto.packedSint32Extension;
import static protobuf_unittest.UnittestProto.packedSint64Extension;
import static protobuf_unittest.UnittestProto.packedFixed32Extension;
import static protobuf_unittest.UnittestProto.packedFixed64Extension;
import static protobuf_unittest.UnittestProto.packedSfixed32Extension;
import static protobuf_unittest.UnittestProto.packedSfixed64Extension;
import static protobuf_unittest.UnittestProto.packedFloatExtension;
import static protobuf_unittest.UnittestProto.packedDoubleExtension;
import static protobuf_unittest.UnittestProto.packedBoolExtension;
import static protobuf_unittest.UnittestProto.packedEnumExtension;

import protobuf_unittest.UnittestProto.TestAllExtensions;
import protobuf_unittest.UnittestProto.TestAllTypes;
import protobuf_unittest.UnittestProto.TestPackedExtensions;
import protobuf_unittest.UnittestProto.TestPackedTypes;
import protobuf_unittest.UnittestProto.ForeignMessage;
import protobuf_unittest.UnittestProto.ForeignEnum;

import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.Message;
import com.googlecode.protobuf.format.test.UnittestImport.ImportEnum;
import com.googlecode.protobuf.format.test.UnittestImport.ImportMessage;

import junit.framework.Assert;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Contains methods for setting all fields of {@code TestAllTypes} to
 * some vaules as well as checking that all the fields are set to those values.
 * These are useful for testing various protocol message features, e.g.
 * set all fields of a message, serialize it, parse it, and check that all
 * fields are set.
 *
 * @author kenton@google.com Kenton Varda
 * Note: This is a modified version for <a href="http://code.google.com/p/protobuf-java-format">protobuf-java-format</a> 
 */
class TestUtil {
  private TestUtil() {}

  /** Helper to convert a String to ByteString. */
  static ByteString toBytes(String str) {
    try {
      return ByteString.copyFrom(str.getBytes("UTF-8"));
    } catch(java.io.UnsupportedEncodingException e) {
      throw new RuntimeException("UTF-8 not supported.", e);
    }
  }

  /**
   * Get a {@code TestAllTypes} with all fields set as they would be by
   * {@link #setAllFields(TestAllTypes.Builder)}.
   */
  public static TestAllTypes getAllSet() {
    TestAllTypes.Builder builder = TestAllTypes.newBuilder();
    setAllFields(builder);
    return builder.build();
  }

  /**
   * Get a {@code TestAllExtensions} with all fields set as they would be by
   * {@link #setAllExtensions(TestAllExtensions.Builder)}.
   */
  public static TestAllExtensions getAllExtensionsSet() {
    TestAllExtensions.Builder builder = TestAllExtensions.newBuilder();
    setAllExtensions(builder);
    return builder.build();
  }

  public static TestPackedTypes getPackedSet() {
    TestPackedTypes.Builder builder = TestPackedTypes.newBuilder();
    setPackedFields(builder);
    return builder.build();
  }

  public static TestPackedExtensions getPackedExtensionsSet() {
    TestPackedExtensions.Builder builder = TestPackedExtensions.newBuilder();
    setPackedExtensions(builder);
    return builder.build();
  }

  /**
   * Set every field of {@code message} to the values expected by
   * {@code assertAllFieldsSet()}.
   */
  public static void setAllFields(TestAllTypes.Builder message) {
    message.setOptionalInt32   (101);
    message.setOptionalInt64   (102);
    message.setOptionalUint32  (103);
    message.setOptionalUint64  (104);
    message.setOptionalSint32  (105);
    message.setOptionalSint64  (106);
    message.setOptionalFixed32 (107);
    message.setOptionalFixed64 (108);
    message.setOptionalSfixed32(109);
    message.setOptionalSfixed64(110);
    message.setOptionalFloat   (111);
    message.setOptionalDouble  (112);
    message.setOptionalBool    (true);
    message.setOptionalString  ("115");
    message.setOptionalBytes   (toBytes("116"));

    message.setOptionalGroup(
      TestAllTypes.OptionalGroup.newBuilder().setA(117).build());
    message.setOptionalNestedMessage(
      TestAllTypes.NestedMessage.newBuilder().setBb(118).build());
    message.setOptionalForeignMessage(
      ForeignMessage.newBuilder().setC(119).build());
    message.setOptionalImportMessage(
      ImportMessage.newBuilder().setD(120).build());

    message.setOptionalNestedEnum (TestAllTypes.NestedEnum.BAZ);
    message.setOptionalForeignEnum(ForeignEnum.FOREIGN_BAZ);
    message.setOptionalImportEnum (ImportEnum.IMPORT_BAZ);

    message.setOptionalStringPiece("124");
    message.setOptionalCord("125");

    // -----------------------------------------------------------------

    message.addRepeatedInt32   (201);
    message.addRepeatedInt64   (202);
    message.addRepeatedUint32  (203);
    message.addRepeatedUint64  (204);
    message.addRepeatedSint32  (205);
    message.addRepeatedSint64  (206);
    message.addRepeatedFixed32 (207);
    message.addRepeatedFixed64 (208);
    message.addRepeatedSfixed32(209);
    message.addRepeatedSfixed64(210);
    message.addRepeatedFloat   (211);
    message.addRepeatedDouble  (212);
    message.addRepeatedBool    (true);
    message.addRepeatedString  ("215");
    message.addRepeatedBytes   (toBytes("216"));

    message.addRepeatedGroup(
      TestAllTypes.RepeatedGroup.newBuilder().setA(217).build());
    message.addRepeatedNestedMessage(
      TestAllTypes.NestedMessage.newBuilder().setBb(218).build());
    message.addRepeatedForeignMessage(
      ForeignMessage.newBuilder().setC(219).build());
    message.addRepeatedImportMessage(
      ImportMessage.newBuilder().setD(220).build());

    message.addRepeatedNestedEnum (TestAllTypes.NestedEnum.BAR);
    message.addRepeatedForeignEnum(ForeignEnum.FOREIGN_BAR);
    message.addRepeatedImportEnum (ImportEnum.IMPORT_BAR);

    message.addRepeatedStringPiece("224");
    message.addRepeatedCord("225");

    // Add a second one of each field.
    message.addRepeatedInt32   (301);
    message.addRepeatedInt64   (302);
    message.addRepeatedUint32  (303);
    message.addRepeatedUint64  (304);
    message.addRepeatedSint32  (305);
    message.addRepeatedSint64  (306);
    message.addRepeatedFixed32 (307);
    message.addRepeatedFixed64 (308);
    message.addRepeatedSfixed32(309);
    message.addRepeatedSfixed64(310);
    message.addRepeatedFloat   (311);
    message.addRepeatedDouble  (312);
    message.addRepeatedBool    (false);
    message.addRepeatedString  ("315");
    message.addRepeatedBytes   (toBytes("316"));

    message.addRepeatedGroup(
      TestAllTypes.RepeatedGroup.newBuilder().setA(317).build());
    message.addRepeatedNestedMessage(
      TestAllTypes.NestedMessage.newBuilder().setBb(318).build());
    message.addRepeatedForeignMessage(
      ForeignMessage.newBuilder().setC(319).build());
    message.addRepeatedImportMessage(
      ImportMessage.newBuilder().setD(320).build());

    message.addRepeatedNestedEnum (TestAllTypes.NestedEnum.BAZ);
    message.addRepeatedForeignEnum(ForeignEnum.FOREIGN_BAZ);
    message.addRepeatedImportEnum (ImportEnum.IMPORT_BAZ);

    message.addRepeatedStringPiece("324");
    message.addRepeatedCord("325");

    // -----------------------------------------------------------------

    message.setDefaultInt32   (401);
    message.setDefaultInt64   (402);
    message.setDefaultUint32  (403);
    message.setDefaultUint64  (404);
    message.setDefaultSint32  (405);
    message.setDefaultSint64  (406);
    message.setDefaultFixed32 (407);
    message.setDefaultFixed64 (408);
    message.setDefaultSfixed32(409);
    message.setDefaultSfixed64(410);
    message.setDefaultFloat   (411);
    message.setDefaultDouble  (412);
    message.setDefaultBool    (false);
    message.setDefaultString  ("415");
    message.setDefaultBytes   (toBytes("416"));

    message.setDefaultNestedEnum (TestAllTypes.NestedEnum.FOO);
    message.setDefaultForeignEnum(ForeignEnum.FOREIGN_FOO);
    message.setDefaultImportEnum (ImportEnum.IMPORT_FOO);

    message.setDefaultStringPiece("424");
    message.setDefaultCord("425");
  }

  // -------------------------------------------------------------------

  /**
   * Modify the repeated fields of {@code message} to contain the values
   * expected by {@code assertRepeatedFieldsModified()}.
   */
  public static void modifyRepeatedFields(TestAllTypes.Builder message) {
    message.setRepeatedInt32   (1, 501);
    message.setRepeatedInt64   (1, 502);
    message.setRepeatedUint32  (1, 503);
    message.setRepeatedUint64  (1, 504);
    message.setRepeatedSint32  (1, 505);
    message.setRepeatedSint64  (1, 506);
    message.setRepeatedFixed32 (1, 507);
    message.setRepeatedFixed64 (1, 508);
    message.setRepeatedSfixed32(1, 509);
    message.setRepeatedSfixed64(1, 510);
    message.setRepeatedFloat   (1, 511);
    message.setRepeatedDouble  (1, 512);
    message.setRepeatedBool    (1, true);
    message.setRepeatedString  (1, "515");
    message.setRepeatedBytes   (1, toBytes("516"));

    message.setRepeatedGroup(1,
      TestAllTypes.RepeatedGroup.newBuilder().setA(517).build());
    message.setRepeatedNestedMessage(1,
      TestAllTypes.NestedMessage.newBuilder().setBb(518).build());
    message.setRepeatedForeignMessage(1,
      ForeignMessage.newBuilder().setC(519).build());
    message.setRepeatedImportMessage(1,
      ImportMessage.newBuilder().setD(520).build());

    message.setRepeatedNestedEnum (1, TestAllTypes.NestedEnum.FOO);
    message.setRepeatedForeignEnum(1, ForeignEnum.FOREIGN_FOO);
    message.setRepeatedImportEnum (1, ImportEnum.IMPORT_FOO);

    message.setRepeatedStringPiece(1, "524");
    message.setRepeatedCord(1, "525");
  }

  // -------------------------------------------------------------------

  /**
   * Assert (using {@code junit.framework.Assert}} that all fields of
   * {@code message} are set to the values assigned by {@code setAllFields}.
   */
  public static void assertAllFieldsSet(TestAllTypes message) {
    Assert.assertTrue(message.hasOptionalInt32   ());
    Assert.assertTrue(message.hasOptionalInt64   ());
    Assert.assertTrue(message.hasOptionalUint32  ());
    Assert.assertTrue(message.hasOptionalUint64  ());
    Assert.assertTrue(message.hasOptionalSint32  ());
    Assert.assertTrue(message.hasOptionalSint64  ());
    Assert.assertTrue(message.hasOptionalFixed32 ());
    Assert.assertTrue(message.hasOptionalFixed64 ());
    Assert.assertTrue(message.hasOptionalSfixed32());
    Assert.assertTrue(message.hasOptionalSfixed64());
    Assert.assertTrue(message.hasOptionalFloat   ());
    Assert.assertTrue(message.hasOptionalDouble  ());
    Assert.assertTrue(message.hasOptionalBool    ());
    Assert.assertTrue(message.hasOptionalString  ());
    Assert.assertTrue(message.hasOptionalBytes   ());

    Assert.assertTrue(message.hasOptionalGroup         ());
    Assert.assertTrue(message.hasOptionalNestedMessage ());
    Assert.assertTrue(message.hasOptionalForeignMessage());
    Assert.assertTrue(message.hasOptionalImportMessage ());

    Assert.assertTrue(message.getOptionalGroup         ().hasA());
    Assert.assertTrue(message.getOptionalNestedMessage ().hasBb());
    Assert.assertTrue(message.getOptionalForeignMessage().hasC());
    Assert.assertTrue(message.getOptionalImportMessage ().hasD());

    Assert.assertTrue(message.hasOptionalNestedEnum ());
    Assert.assertTrue(message.hasOptionalForeignEnum());
    Assert.assertTrue(message.hasOptionalImportEnum ());

    Assert.assertTrue(message.hasOptionalStringPiece());
    Assert.assertTrue(message.hasOptionalCord());

    Assert.assertEquals(101  , message.getOptionalInt32   ());
    Assert.assertEquals(102  , message.getOptionalInt64   ());
    Assert.assertEquals(103  , message.getOptionalUint32  ());
    Assert.assertEquals(104  , message.getOptionalUint64  ());
    Assert.assertEquals(105  , message.getOptionalSint32  ());
    Assert.assertEquals(106  , message.getOptionalSint64  ());
    Assert.assertEquals(107  , message.getOptionalFixed32 ());
    Assert.assertEquals(108  , message.getOptionalFixed64 ());
    Assert.assertEquals(109  , message.getOptionalSfixed32());
    Assert.assertEquals(110  , message.getOptionalSfixed64());
    Assert.assertEquals(111  , message.getOptionalFloat   (), 0.0);
    Assert.assertEquals(112  , message.getOptionalDouble  (), 0.0);
    Assert.assertEquals(true , message.getOptionalBool    ());
    Assert.assertEquals("115", message.getOptionalString  ());
    Assert.assertEquals(toBytes("116"), message.getOptionalBytes());

    Assert.assertEquals(117, message.getOptionalGroup         ().getA());
    Assert.assertEquals(118, message.getOptionalNestedMessage ().getBb());
    Assert.assertEquals(119, message.getOptionalForeignMessage().getC());
    Assert.assertEquals(120, message.getOptionalImportMessage ().getD());

    Assert.assertEquals(TestAllTypes.NestedEnum.BAZ, message.getOptionalNestedEnum());
    Assert.assertEquals(ForeignEnum.FOREIGN_BAZ, message.getOptionalForeignEnum());
    Assert.assertEquals(ImportEnum.IMPORT_BAZ, message.getOptionalImportEnum());

    Assert.assertEquals("124", message.getOptionalStringPiece());
    Assert.assertEquals("125", message.getOptionalCord());

    // -----------------------------------------------------------------

    Assert.assertEquals(2, message.getRepeatedInt32Count   ());
    Assert.assertEquals(2, message.getRepeatedInt64Count   ());
    Assert.assertEquals(2, message.getRepeatedUint32Count  ());
    Assert.assertEquals(2, message.getRepeatedUint64Count  ());
    Assert.assertEquals(2, message.getRepeatedSint32Count  ());
    Assert.assertEquals(2, message.getRepeatedSint64Count  ());
    Assert.assertEquals(2, message.getRepeatedFixed32Count ());
    Assert.assertEquals(2, message.getRepeatedFixed64Count ());
    Assert.assertEquals(2, message.getRepeatedSfixed32Count());
    Assert.assertEquals(2, message.getRepeatedSfixed64Count());
    Assert.assertEquals(2, message.getRepeatedFloatCount   ());
    Assert.assertEquals(2, message.getRepeatedDoubleCount  ());
    Assert.assertEquals(2, message.getRepeatedBoolCount    ());
    Assert.assertEquals(2, message.getRepeatedStringCount  ());
    Assert.assertEquals(2, message.getRepeatedBytesCount   ());

    Assert.assertEquals(2, message.getRepeatedGroupCount         ());
    Assert.assertEquals(2, message.getRepeatedNestedMessageCount ());
    Assert.assertEquals(2, message.getRepeatedForeignMessageCount());
    Assert.assertEquals(2, message.getRepeatedImportMessageCount ());
    Assert.assertEquals(2, message.getRepeatedNestedEnumCount    ());
    Assert.assertEquals(2, message.getRepeatedForeignEnumCount   ());
    Assert.assertEquals(2, message.getRepeatedImportEnumCount    ());

    Assert.assertEquals(2, message.getRepeatedStringPieceCount());
    Assert.assertEquals(2, message.getRepeatedCordCount());

    Assert.assertEquals(201  , message.getRepeatedInt32   (0));
    Assert.assertEquals(202  , message.getRepeatedInt64   (0));
    Assert.assertEquals(203  , message.getRepeatedUint32  (0));
    Assert.assertEquals(204  , message.getRepeatedUint64  (0));
    Assert.assertEquals(205  , message.getRepeatedSint32  (0));
    Assert.assertEquals(206  , message.getRepeatedSint64  (0));
    Assert.assertEquals(207  , message.getRepeatedFixed32 (0));
    Assert.assertEquals(208  , message.getRepeatedFixed64 (0));
    Assert.assertEquals(209  , message.getRepeatedSfixed32(0));
    Assert.assertEquals(210  , message.getRepeatedSfixed64(0));
    Assert.assertEquals(211  , message.getRepeatedFloat   (0), 0.0);
    Assert.assertEquals(212  , message.getRepeatedDouble  (0), 0.0);
    Assert.assertEquals(true , message.getRepeatedBool    (0));
    Assert.assertEquals("215", message.getRepeatedString  (0));
    Assert.assertEquals(toBytes("216"), message.getRepeatedBytes(0));

    Assert.assertEquals(217, message.getRepeatedGroup         (0).getA());
    Assert.assertEquals(218, message.getRepeatedNestedMessage (0).getBb());
    Assert.assertEquals(219, message.getRepeatedForeignMessage(0).getC());
    Assert.assertEquals(220, message.getRepeatedImportMessage (0).getD());

    Assert.assertEquals(TestAllTypes.NestedEnum.BAR, message.getRepeatedNestedEnum (0));
    Assert.assertEquals(ForeignEnum.FOREIGN_BAR, message.getRepeatedForeignEnum(0));
    Assert.assertEquals(ImportEnum.IMPORT_BAR, message.getRepeatedImportEnum(0));

    Assert.assertEquals("224", message.getRepeatedStringPiece(0));
    Assert.assertEquals("225", message.getRepeatedCord(0));

    Assert.assertEquals(301  , message.getRepeatedInt32   (1));
    Assert.assertEquals(302  , message.getRepeatedInt64   (1));
    Assert.assertEquals(303  , message.getRepeatedUint32  (1));
    Assert.assertEquals(304  , message.getRepeatedUint64  (1));
    Assert.assertEquals(305  , message.getRepeatedSint32  (1));
    Assert.assertEquals(306  , message.getRepeatedSint64  (1));
    Assert.assertEquals(307  , message.getRepeatedFixed32 (1));
    Assert.assertEquals(308  , message.getRepeatedFixed64 (1));
    Assert.assertEquals(309  , message.getRepeatedSfixed32(1));
    Assert.assertEquals(310  , message.getRepeatedSfixed64(1));
    Assert.assertEquals(311  , message.getRepeatedFloat   (1), 0.0);
    Assert.assertEquals(312  , message.getRepeatedDouble  (1), 0.0);
    Assert.assertEquals(false, message.getRepeatedBool    (1));
    Assert.assertEquals("315", message.getRepeatedString  (1));
    Assert.assertEquals(toBytes("316"), message.getRepeatedBytes(1));

    Assert.assertEquals(317, message.getRepeatedGroup         (1).getA());
    Assert.assertEquals(318, message.getRepeatedNestedMessage (1).getBb());
    Assert.assertEquals(319, message.getRepeatedForeignMessage(1).getC());
    Assert.assertEquals(320, message.getRepeatedImportMessage (1).getD());

    Assert.assertEquals(TestAllTypes.NestedEnum.BAZ, message.getRepeatedNestedEnum (1));
    Assert.assertEquals(ForeignEnum.FOREIGN_BAZ, message.getRepeatedForeignEnum(1));
    Assert.assertEquals(ImportEnum.IMPORT_BAZ, message.getRepeatedImportEnum(1));

    Assert.assertEquals("324", message.getRepeatedStringPiece(1));
    Assert.assertEquals("325", message.getRepeatedCord(1));

    // -----------------------------------------------------------------

    Assert.assertTrue(message.hasDefaultInt32   ());
    Assert.assertTrue(message.hasDefaultInt64   ());
    Assert.assertTrue(message.hasDefaultUint32  ());
    Assert.assertTrue(message.hasDefaultUint64  ());
    Assert.assertTrue(message.hasDefaultSint32  ());
    Assert.assertTrue(message.hasDefaultSint64  ());
    Assert.assertTrue(message.hasDefaultFixed32 ());
    Assert.assertTrue(message.hasDefaultFixed64 ());
    Assert.assertTrue(message.hasDefaultSfixed32());
    Assert.assertTrue(message.hasDefaultSfixed64());
    Assert.assertTrue(message.hasDefaultFloat   ());
    Assert.assertTrue(message.hasDefaultDouble  ());
    Assert.assertTrue(message.hasDefaultBool    ());
    Assert.assertTrue(message.hasDefaultString  ());
    Assert.assertTrue(message.hasDefaultBytes   ());

    Assert.assertTrue(message.hasDefaultNestedEnum ());
    Assert.assertTrue(message.hasDefaultForeignEnum());
    Assert.assertTrue(message.hasDefaultImportEnum ());

    Assert.assertTrue(message.hasDefaultStringPiece());
    Assert.assertTrue(message.hasDefaultCord());

    Assert.assertEquals(401  , message.getDefaultInt32   ());
    Assert.assertEquals(402  , message.getDefaultInt64   ());
    Assert.assertEquals(403  , message.getDefaultUint32  ());
    Assert.assertEquals(404  , message.getDefaultUint64  ());
    Assert.assertEquals(405  , message.getDefaultSint32  ());
    Assert.assertEquals(406  , message.getDefaultSint64  ());
    Assert.assertEquals(407  , message.getDefaultFixed32 ());
    Assert.assertEquals(408  , message.getDefaultFixed64 ());
    Assert.assertEquals(409  , message.getDefaultSfixed32());
    Assert.assertEquals(410  , message.getDefaultSfixed64());
    Assert.assertEquals(411  , message.getDefaultFloat   (), 0.0);
    Assert.assertEquals(412  , message.getDefaultDouble  (), 0.0);
    Assert.assertEquals(false, message.getDefaultBool    ());
    Assert.assertEquals("415", message.getDefaultString  ());
    Assert.assertEquals(toBytes("416"), message.getDefaultBytes());

    Assert.assertEquals(TestAllTypes.NestedEnum.FOO, message.getDefaultNestedEnum ());
    Assert.assertEquals(ForeignEnum.FOREIGN_FOO, message.getDefaultForeignEnum());
    Assert.assertEquals(ImportEnum.IMPORT_FOO, message.getDefaultImportEnum());

    Assert.assertEquals("424", message.getDefaultStringPiece());
    Assert.assertEquals("425", message.getDefaultCord());
  }

  // -------------------------------------------------------------------

  /**
   * Assert (using {@code junit.framework.Assert}} that all fields of
   * {@code message} are cleared, and that getting the fields returns their
   * default values.
   */
  public static void assertClear(TestAllTypes message) {
    // hasBlah() should initially be false for all optional fields.
    Assert.assertFalse(message.hasOptionalInt32   ());
    Assert.assertFalse(message.hasOptionalInt64   ());
    Assert.assertFalse(message.hasOptionalUint32  ());
    Assert.assertFalse(message.hasOptionalUint64  ());
    Assert.assertFalse(message.hasOptionalSint32  ());
    Assert.assertFalse(message.hasOptionalSint64  ());
    Assert.assertFalse(message.hasOptionalFixed32 ());
    Assert.assertFalse(message.hasOptionalFixed64 ());
    Assert.assertFalse(message.hasOptionalSfixed32());
    Assert.assertFalse(message.hasOptionalSfixed64());
    Assert.assertFalse(message.hasOptionalFloat   ());
    Assert.assertFalse(message.hasOptionalDouble  ());
    Assert.assertFalse(message.hasOptionalBool    ());
    Assert.assertFalse(message.hasOptionalString  ());
    Assert.assertFalse(message.hasOptionalBytes   ());

    Assert.assertFalse(message.hasOptionalGroup         ());
    Assert.assertFalse(message.hasOptionalNestedMessage ());
    Assert.assertFalse(message.hasOptionalForeignMessage());
    Assert.assertFalse(message.hasOptionalImportMessage ());

    Assert.assertFalse(message.hasOptionalNestedEnum ());
    Assert.assertFalse(message.hasOptionalForeignEnum());
    Assert.assertFalse(message.hasOptionalImportEnum ());

    Assert.assertFalse(message.hasOptionalStringPiece());
    Assert.assertFalse(message.hasOptionalCord());

    // Optional fields without defaults are set to zero or something like it.
    Assert.assertEquals(0    , message.getOptionalInt32   ());
    Assert.assertEquals(0    , message.getOptionalInt64   ());
    Assert.assertEquals(0    , message.getOptionalUint32  ());
    Assert.assertEquals(0    , message.getOptionalUint64  ());
    Assert.assertEquals(0    , message.getOptionalSint32  ());
    Assert.assertEquals(0    , message.getOptionalSint64  ());
    Assert.assertEquals(0    , message.getOptionalFixed32 ());
    Assert.assertEquals(0    , message.getOptionalFixed64 ());
    Assert.assertEquals(0    , message.getOptionalSfixed32());
    Assert.assertEquals(0    , message.getOptionalSfixed64());
    Assert.assertEquals(0    , message.getOptionalFloat   (), 0.0);
    Assert.assertEquals(0    , message.getOptionalDouble  (), 0.0);
    Assert.assertEquals(false, message.getOptionalBool    ());
    Assert.assertEquals(""   , message.getOptionalString  ());
    Assert.assertEquals(ByteString.EMPTY, message.getOptionalBytes());

    // Embedded messages should also be clear.
    Assert.assertFalse(message.getOptionalGroup         ().hasA());
    Assert.assertFalse(message.getOptionalNestedMessage ().hasBb());
    Assert.assertFalse(message.getOptionalForeignMessage().hasC());
    Assert.assertFalse(message.getOptionalImportMessage ().hasD());

    Assert.assertEquals(0, message.getOptionalGroup         ().getA());
    Assert.assertEquals(0, message.getOptionalNestedMessage ().getBb());
    Assert.assertEquals(0, message.getOptionalForeignMessage().getC());
    Assert.assertEquals(0, message.getOptionalImportMessage ().getD());

    // Enums without defaults are set to the first value in the enum.
    Assert.assertEquals(TestAllTypes.NestedEnum.FOO, message.getOptionalNestedEnum ());
    Assert.assertEquals(ForeignEnum.FOREIGN_FOO, message.getOptionalForeignEnum());
    Assert.assertEquals(ImportEnum.IMPORT_FOO, message.getOptionalImportEnum());

    Assert.assertEquals("", message.getOptionalStringPiece());
    Assert.assertEquals("", message.getOptionalCord());

    // Repeated fields are empty.
    Assert.assertEquals(0, message.getRepeatedInt32Count   ());
    Assert.assertEquals(0, message.getRepeatedInt64Count   ());
    Assert.assertEquals(0, message.getRepeatedUint32Count  ());
    Assert.assertEquals(0, message.getRepeatedUint64Count  ());
    Assert.assertEquals(0, message.getRepeatedSint32Count  ());
    Assert.assertEquals(0, message.getRepeatedSint64Count  ());
    Assert.assertEquals(0, message.getRepeatedFixed32Count ());
    Assert.assertEquals(0, message.getRepeatedFixed64Count ());
    Assert.assertEquals(0, message.getRepeatedSfixed32Count());
    Assert.assertEquals(0, message.getRepeatedSfixed64Count());
    Assert.assertEquals(0, message.getRepeatedFloatCount   ());
    Assert.assertEquals(0, message.getRepeatedDoubleCount  ());
    Assert.assertEquals(0, message.getRepeatedBoolCount    ());
    Assert.assertEquals(0, message.getRepeatedStringCount  ());
    Assert.assertEquals(0, message.getRepeatedBytesCount   ());

    Assert.assertEquals(0, message.getRepeatedGroupCount         ());
    Assert.assertEquals(0, message.getRepeatedNestedMessageCount ());
    Assert.assertEquals(0, message.getRepeatedForeignMessageCount());
    Assert.assertEquals(0, message.getRepeatedImportMessageCount ());
    Assert.assertEquals(0, message.getRepeatedNestedEnumCount    ());
    Assert.assertEquals(0, message.getRepeatedForeignEnumCount   ());
    Assert.assertEquals(0, message.getRepeatedImportEnumCount    ());

    Assert.assertEquals(0, message.getRepeatedStringPieceCount());
    Assert.assertEquals(0, message.getRepeatedCordCount());

    // hasBlah() should also be false for all default fields.
    Assert.assertFalse(message.hasDefaultInt32   ());
    Assert.assertFalse(message.hasDefaultInt64   ());
    Assert.assertFalse(message.hasDefaultUint32  ());
    Assert.assertFalse(message.hasDefaultUint64  ());
    Assert.assertFalse(message.hasDefaultSint32  ());
    Assert.assertFalse(message.hasDefaultSint64  ());
    Assert.assertFalse(message.hasDefaultFixed32 ());
    Assert.assertFalse(message.hasDefaultFixed64 ());
    Assert.assertFalse(message.hasDefaultSfixed32());
    Assert.assertFalse(message.hasDefaultSfixed64());
    Assert.assertFalse(message.hasDefaultFloat   ());
    Assert.assertFalse(message.hasDefaultDouble  ());
    Assert.assertFalse(message.hasDefaultBool    ());
    Assert.assertFalse(message.hasDefaultString  ());
    Assert.assertFalse(message.hasDefaultBytes   ());

    Assert.assertFalse(message.hasDefaultNestedEnum ());
    Assert.assertFalse(message.hasDefaultForeignEnum());
    Assert.assertFalse(message.hasDefaultImportEnum ());

    Assert.assertFalse(message.hasDefaultStringPiece());
    Assert.assertFalse(message.hasDefaultCord());

    // Fields with defaults have their default values (duh).
    Assert.assertEquals( 41    , message.getDefaultInt32   ());
    Assert.assertEquals( 42    , message.getDefaultInt64   ());
    Assert.assertEquals( 43    , message.getDefaultUint32  ());
    Assert.assertEquals( 44    , message.getDefaultUint64  ());
    Assert.assertEquals(-45    , message.getDefaultSint32  ());
    Assert.assertEquals( 46    , message.getDefaultSint64  ());
    Assert.assertEquals( 47    , message.getDefaultFixed32 ());
    Assert.assertEquals( 48    , message.getDefaultFixed64 ());
    Assert.assertEquals( 49    , message.getDefaultSfixed32());
    Assert.assertEquals(-50    , message.getDefaultSfixed64());
    Assert.assertEquals( 51.5  , message.getDefaultFloat   (), 0.0);
    Assert.assertEquals( 52e3  , message.getDefaultDouble  (), 0.0);
    Assert.assertEquals(true   , message.getDefaultBool    ());
    Assert.assertEquals("hello", message.getDefaultString  ());
    Assert.assertEquals(toBytes("world"), message.getDefaultBytes());

    Assert.assertEquals(TestAllTypes.NestedEnum.BAR, message.getDefaultNestedEnum ());
    Assert.assertEquals(ForeignEnum.FOREIGN_BAR, message.getDefaultForeignEnum());
    Assert.assertEquals(ImportEnum.IMPORT_BAR, message.getDefaultImportEnum());

    Assert.assertEquals("abc", message.getDefaultStringPiece());
    Assert.assertEquals("123", message.getDefaultCord());
  }

  // -------------------------------------------------------------------

  /**
   * Assert (using {@code junit.framework.Assert}} that all fields of
   * {@code message} are set to the values assigned by {@code setAllFields}
   * followed by {@code modifyRepeatedFields}.
   */
  public static void assertRepeatedFieldsModified(TestAllTypes message) {
    // ModifyRepeatedFields only sets the second repeated element of each
    // field.  In addition to verifying this, we also verify that the first
    // element and size were *not* modified.
    Assert.assertEquals(2, message.getRepeatedInt32Count   ());
    Assert.assertEquals(2, message.getRepeatedInt64Count   ());
    Assert.assertEquals(2, message.getRepeatedUint32Count  ());
    Assert.assertEquals(2, message.getRepeatedUint64Count  ());
    Assert.assertEquals(2, message.getRepeatedSint32Count  ());
    Assert.assertEquals(2, message.getRepeatedSint64Count  ());
    Assert.assertEquals(2, message.getRepeatedFixed32Count ());
    Assert.assertEquals(2, message.getRepeatedFixed64Count ());
    Assert.assertEquals(2, message.getRepeatedSfixed32Count());
    Assert.assertEquals(2, message.getRepeatedSfixed64Count());
    Assert.assertEquals(2, message.getRepeatedFloatCount   ());
    Assert.assertEquals(2, message.getRepeatedDoubleCount  ());
    Assert.assertEquals(2, message.getRepeatedBoolCount    ());
    Assert.assertEquals(2, message.getRepeatedStringCount  ());
    Assert.assertEquals(2, message.getRepeatedBytesCount   ());

    Assert.assertEquals(2, message.getRepeatedGroupCount         ());
    Assert.assertEquals(2, message.getRepeatedNestedMessageCount ());
    Assert.assertEquals(2, message.getRepeatedForeignMessageCount());
    Assert.assertEquals(2, message.getRepeatedImportMessageCount ());
    Assert.assertEquals(2, message.getRepeatedNestedEnumCount    ());
    Assert.assertEquals(2, message.getRepeatedForeignEnumCount   ());
    Assert.assertEquals(2, message.getRepeatedImportEnumCount    ());

    Assert.assertEquals(2, message.getRepeatedStringPieceCount());
    Assert.assertEquals(2, message.getRepeatedCordCount());

    Assert.assertEquals(201  , message.getRepeatedInt32   (0));
    Assert.assertEquals(202L , message.getRepeatedInt64   (0));
    Assert.assertEquals(203  , message.getRepeatedUint32  (0));
    Assert.assertEquals(204L , message.getRepeatedUint64  (0));
    Assert.assertEquals(205  , message.getRepeatedSint32  (0));
    Assert.assertEquals(206L , message.getRepeatedSint64  (0));
    Assert.assertEquals(207  , message.getRepeatedFixed32 (0));
    Assert.assertEquals(208L , message.getRepeatedFixed64 (0));
    Assert.assertEquals(209  , message.getRepeatedSfixed32(0));
    Assert.assertEquals(210L , message.getRepeatedSfixed64(0));
    Assert.assertEquals(211F , message.getRepeatedFloat   (0));
    Assert.assertEquals(212D , message.getRepeatedDouble  (0));
    Assert.assertEquals(true , message.getRepeatedBool    (0));
    Assert.assertEquals("215", message.getRepeatedString  (0));
    Assert.assertEquals(toBytes("216"), message.getRepeatedBytes(0));

    Assert.assertEquals(217, message.getRepeatedGroup         (0).getA());
    Assert.assertEquals(218, message.getRepeatedNestedMessage (0).getBb());
    Assert.assertEquals(219, message.getRepeatedForeignMessage(0).getC());
    Assert.assertEquals(220, message.getRepeatedImportMessage (0).getD());

    Assert.assertEquals(TestAllTypes.NestedEnum.BAR, message.getRepeatedNestedEnum (0));
    Assert.assertEquals(ForeignEnum.FOREIGN_BAR, message.getRepeatedForeignEnum(0));
    Assert.assertEquals(ImportEnum.IMPORT_BAR, message.getRepeatedImportEnum(0));

    Assert.assertEquals("224", message.getRepeatedStringPiece(0));
    Assert.assertEquals("225", message.getRepeatedCord(0));

    // Actually verify the second (modified) elements now.
    Assert.assertEquals(501  , message.getRepeatedInt32   (1));
    Assert.assertEquals(502L , message.getRepeatedInt64   (1));
    Assert.assertEquals(503  , message.getRepeatedUint32  (1));
    Assert.assertEquals(504L , message.getRepeatedUint64  (1));
    Assert.assertEquals(505  , message.getRepeatedSint32  (1));
    Assert.assertEquals(506L , message.getRepeatedSint64  (1));
    Assert.assertEquals(507  , message.getRepeatedFixed32 (1));
    Assert.assertEquals(508L , message.getRepeatedFixed64 (1));
    Assert.assertEquals(509  , message.getRepeatedSfixed32(1));
    Assert.assertEquals(510L , message.getRepeatedSfixed64(1));
    Assert.assertEquals(511F , message.getRepeatedFloat   (1));
    Assert.assertEquals(512D , message.getRepeatedDouble  (1));
    Assert.assertEquals(true , message.getRepeatedBool    (1));
    Assert.assertEquals("515", message.getRepeatedString  (1));
    Assert.assertEquals(toBytes("516"), message.getRepeatedBytes(1));

    Assert.assertEquals(517, message.getRepeatedGroup         (1).getA());
    Assert.assertEquals(518, message.getRepeatedNestedMessage (1).getBb());
    Assert.assertEquals(519, message.getRepeatedForeignMessage(1).getC());
    Assert.assertEquals(520, message.getRepeatedImportMessage (1).getD());

    Assert.assertEquals(TestAllTypes.NestedEnum.FOO, message.getRepeatedNestedEnum (1));
    Assert.assertEquals(ForeignEnum.FOREIGN_FOO, message.getRepeatedForeignEnum(1));
    Assert.assertEquals(ImportEnum.IMPORT_FOO, message.getRepeatedImportEnum(1));

    Assert.assertEquals("524", message.getRepeatedStringPiece(1));
    Assert.assertEquals("525", message.getRepeatedCord(1));
  }

  // ===================================================================
  // Like above, but for extensions

  // Java gets confused with things like assertEquals(int, Integer):  it can't
  // decide whether to call assertEquals(int, int) or assertEquals(Object,
  // Object).  So we define these methods to help it.
  private static void assertEqualsExactType(int a, int b) {
    Assert.assertEquals(a, b);
  }
  private static void assertEqualsExactType(long a, long b) {
    Assert.assertEquals(a, b);
  }
  private static void assertEqualsExactType(float a, float b) {
    Assert.assertEquals(a, b, 0.0);
  }
  private static void assertEqualsExactType(double a, double b) {
    Assert.assertEquals(a, b, 0.0);
  }
  private static void assertEqualsExactType(boolean a, boolean b) {
    Assert.assertEquals(a, b);
  }
  private static void assertEqualsExactType(String a, String b) {
    Assert.assertEquals(a, b);
  }
  private static void assertEqualsExactType(ByteString a, ByteString b) {
    Assert.assertEquals(a, b);
  }
  private static void assertEqualsExactType(TestAllTypes.NestedEnum a,
                                            TestAllTypes.NestedEnum b) {
    Assert.assertEquals(a, b);
  }
  private static void assertEqualsExactType(ForeignEnum a, ForeignEnum b) {
    Assert.assertEquals(a, b);
  }
  private static void assertEqualsExactType(ImportEnum a, ImportEnum b) {
    Assert.assertEquals(a, b);
  }

  /**
   * Get an unmodifiable {@link ExtensionRegistry} containing all the
   * extensions of {@code TestAllExtensions}.
   */
  public static ExtensionRegistry getExtensionRegistry() {
    ExtensionRegistry registry = ExtensionRegistry.newInstance();
    registerAllExtensions(registry);
    return registry.getUnmodifiable();
  }

  /**
   * Register all of {@code TestAllExtensions}' extensions with the
   * given {@link ExtensionRegistry}.
   */
  public static void registerAllExtensions(ExtensionRegistry registry) {
    UnittestProto.registerAllExtensions(registry);
  }

  /**
   * Set every field of {@code message} to the values expected by
   * {@code assertAllExtensionsSet()}.
   */
  public static void setAllExtensions(TestAllExtensions.Builder message) {
    message.setExtension(optionalInt32Extension   , 101);
    message.setExtension(optionalInt64Extension   , 102L);
    message.setExtension(optionalUint32Extension  , 103);
    message.setExtension(optionalUint64Extension  , 104L);
    message.setExtension(optionalSint32Extension  , 105);
    message.setExtension(optionalSint64Extension  , 106L);
    message.setExtension(optionalFixed32Extension , 107);
    message.setExtension(optionalFixed64Extension , 108L);
    message.setExtension(optionalSfixed32Extension, 109);
    message.setExtension(optionalSfixed64Extension, 110L);
    message.setExtension(optionalFloatExtension   , 111F);
    message.setExtension(optionalDoubleExtension  , 112D);
    message.setExtension(optionalBoolExtension    , true);
    message.setExtension(optionalStringExtension  , "115");
    message.setExtension(optionalBytesExtension   , toBytes("116"));

    message.setExtension(optionalGroupExtension,
      OptionalGroup_extension.newBuilder().setA(117).build());
    message.setExtension(optionalNestedMessageExtension,
      TestAllTypes.NestedMessage.newBuilder().setBb(118).build());
    message.setExtension(optionalForeignMessageExtension,
      ForeignMessage.newBuilder().setC(119).build());
    message.setExtension(optionalImportMessageExtension,
      ImportMessage.newBuilder().setD(120).build());

    message.setExtension(optionalNestedEnumExtension, TestAllTypes.NestedEnum.BAZ);
    message.setExtension(optionalForeignEnumExtension, ForeignEnum.FOREIGN_BAZ);
    message.setExtension(optionalImportEnumExtension, ImportEnum.IMPORT_BAZ);

    message.setExtension(optionalStringPieceExtension, "124");
    message.setExtension(optionalCordExtension, "125");

    // -----------------------------------------------------------------

    message.addExtension(repeatedInt32Extension   , 201);
    message.addExtension(repeatedInt64Extension   , 202L);
    message.addExtension(repeatedUint32Extension  , 203);
    message.addExtension(repeatedUint64Extension  , 204L);
    message.addExtension(repeatedSint32Extension  , 205);
    message.addExtension(repeatedSint64Extension  , 206L);
    message.addExtension(repeatedFixed32Extension , 207);
    message.addExtension(repeatedFixed64Extension , 208L);
    message.addExtension(repeatedSfixed32Extension, 209);
    message.addExtension(repeatedSfixed64Extension, 210L);
    message.addExtension(repeatedFloatExtension   , 211F);
    message.addExtension(repeatedDoubleExtension  , 212D);
    message.addExtension(repeatedBoolExtension    , true);
    message.addExtension(repeatedStringExtension  , "215");
    message.addExtension(repeatedBytesExtension   , toBytes("216"));

    message.addExtension(repeatedGroupExtension,
      RepeatedGroup_extension.newBuilder().setA(217).build());
    message.addExtension(repeatedNestedMessageExtension,
      TestAllTypes.NestedMessage.newBuilder().setBb(218).build());
    message.addExtension(repeatedForeignMessageExtension,
      ForeignMessage.newBuilder().setC(219).build());
    message.addExtension(repeatedImportMessageExtension,
      ImportMessage.newBuilder().setD(220).build());

    message.addExtension(repeatedNestedEnumExtension, TestAllTypes.NestedEnum.BAR);
    message.addExtension(repeatedForeignEnumExtension, ForeignEnum.FOREIGN_BAR);
    message.addExtension(repeatedImportEnumExtension, ImportEnum.IMPORT_BAR);

    message.addExtension(repeatedStringPieceExtension, "224");
    message.addExtension(repeatedCordExtension, "225");

    // Add a second one of each field.
    message.addExtension(repeatedInt32Extension   , 301);
    message.addExtension(repeatedInt64Extension   , 302L);
    message.addExtension(repeatedUint32Extension  , 303);
    message.addExtension(repeatedUint64Extension  , 304L);
    message.addExtension(repeatedSint32Extension  , 305);
    message.addExtension(repeatedSint64Extension  , 306L);
    message.addExtension(repeatedFixed32Extension , 307);
    message.addExtension(repeatedFixed64Extension , 308L);
    message.addExtension(repeatedSfixed32Extension, 309);
    message.addExtension(repeatedSfixed64Extension, 310L);
    message.addExtension(repeatedFloatExtension   , 311F);
    message.addExtension(repeatedDoubleExtension  , 312D);
    message.addExtension(repeatedBoolExtension    , false);
    message.addExtension(repeatedStringExtension  , "315");
    message.addExtension(repeatedBytesExtension   , toBytes("316"));

    message.addExtension(repeatedGroupExtension,
      RepeatedGroup_extension.newBuilder().setA(317).build());
    message.addExtension(repeatedNestedMessageExtension,
      TestAllTypes.NestedMessage.newBuilder().setBb(318).build());
    message.addExtension(repeatedForeignMessageExtension,
      ForeignMessage.newBuilder().setC(319).build());
    message.addExtension(repeatedImportMessageExtension,
      ImportMessage.newBuilder().setD(320).build());

    message.addExtension(repeatedNestedEnumExtension, TestAllTypes.NestedEnum.BAZ);
    message.addExtension(repeatedForeignEnumExtension, ForeignEnum.FOREIGN_BAZ);
    message.addExtension(repeatedImportEnumExtension, ImportEnum.IMPORT_BAZ);

    message.addExtension(repeatedStringPieceExtension, "324");
    message.addExtension(repeatedCordExtension, "325");

    // -----------------------------------------------------------------

    message.setExtension(defaultInt32Extension   , 401);
    message.setExtension(defaultInt64Extension   , 402L);
    message.setExtension(defaultUint32Extension  , 403);
    message.setExtension(defaultUint64Extension  , 404L);
    message.setExtension(defaultSint32Extension  , 405);
    message.setExtension(defaultSint64Extension  , 406L);
    message.setExtension(defaultFixed32Extension , 407);
    message.setExtension(defaultFixed64Extension , 408L);
    message.setExtension(defaultSfixed32Extension, 409);
    message.setExtension(defaultSfixed64Extension, 410L);
    message.setExtension(defaultFloatExtension   , 411F);
    message.setExtension(defaultDoubleExtension  , 412D);
    message.setExtension(defaultBoolExtension    , false);
    message.setExtension(defaultStringExtension  , "415");
    message.setExtension(defaultBytesExtension   , toBytes("416"));

    message.setExtension(defaultNestedEnumExtension, TestAllTypes.NestedEnum.FOO);
    message.setExtension(defaultForeignEnumExtension, ForeignEnum.FOREIGN_FOO);
    message.setExtension(defaultImportEnumExtension, ImportEnum.IMPORT_FOO);

    message.setExtension(defaultStringPieceExtension, "424");
    message.setExtension(defaultCordExtension, "425");
  }

  // -------------------------------------------------------------------

  /**
   * Modify the repeated extensions of {@code message} to contain the values
   * expected by {@code assertRepeatedExtensionsModified()}.
   */
  public static void modifyRepeatedExtensions(
      TestAllExtensions.Builder message) {
    message.setExtension(repeatedInt32Extension   , 1, 501);
    message.setExtension(repeatedInt64Extension   , 1, 502L);
    message.setExtension(repeatedUint32Extension  , 1, 503);
    message.setExtension(repeatedUint64Extension  , 1, 504L);
    message.setExtension(repeatedSint32Extension  , 1, 505);
    message.setExtension(repeatedSint64Extension  , 1, 506L);
    message.setExtension(repeatedFixed32Extension , 1, 507);
    message.setExtension(repeatedFixed64Extension , 1, 508L);
    message.setExtension(repeatedSfixed32Extension, 1, 509);
    message.setExtension(repeatedSfixed64Extension, 1, 510L);
    message.setExtension(repeatedFloatExtension   , 1, 511F);
    message.setExtension(repeatedDoubleExtension  , 1, 512D);
    message.setExtension(repeatedBoolExtension    , 1, true);
    message.setExtension(repeatedStringExtension  , 1, "515");
    message.setExtension(repeatedBytesExtension   , 1, toBytes("516"));

    message.setExtension(repeatedGroupExtension, 1,
      RepeatedGroup_extension.newBuilder().setA(517).build());
    message.setExtension(repeatedNestedMessageExtension, 1,
      TestAllTypes.NestedMessage.newBuilder().setBb(518).build());
    message.setExtension(repeatedForeignMessageExtension, 1,
      ForeignMessage.newBuilder().setC(519).build());
    message.setExtension(repeatedImportMessageExtension, 1,
      ImportMessage.newBuilder().setD(520).build());

    message.setExtension(repeatedNestedEnumExtension , 1, TestAllTypes.NestedEnum.FOO);
    message.setExtension(repeatedForeignEnumExtension, 1, ForeignEnum.FOREIGN_FOO);
    message.setExtension(repeatedImportEnumExtension , 1, ImportEnum.IMPORT_FOO);

    message.setExtension(repeatedStringPieceExtension, 1, "524");
    message.setExtension(repeatedCordExtension, 1, "525");
  }

  // -------------------------------------------------------------------

  /**
   * Assert (using {@code junit.framework.Assert}} that all extensions of
   * {@code message} are set to the values assigned by {@code setAllExtensions}.
   */
  public static void assertAllExtensionsSet(TestAllExtensions message) {
    Assert.assertTrue(message.hasExtension(optionalInt32Extension   ));
    Assert.assertTrue(message.hasExtension(optionalInt64Extension   ));
    Assert.assertTrue(message.hasExtension(optionalUint32Extension  ));
    Assert.assertTrue(message.hasExtension(optionalUint64Extension  ));
    Assert.assertTrue(message.hasExtension(optionalSint32Extension  ));
    Assert.assertTrue(message.hasExtension(optionalSint64Extension  ));
    Assert.assertTrue(message.hasExtension(optionalFixed32Extension ));
    Assert.assertTrue(message.hasExtension(optionalFixed64Extension ));
    Assert.assertTrue(message.hasExtension(optionalSfixed32Extension));
    Assert.assertTrue(message.hasExtension(optionalSfixed64Extension));
    Assert.assertTrue(message.hasExtension(optionalFloatExtension   ));
    Assert.assertTrue(message.hasExtension(optionalDoubleExtension  ));
    Assert.assertTrue(message.hasExtension(optionalBoolExtension    ));
    Assert.assertTrue(message.hasExtension(optionalStringExtension  ));
    Assert.assertTrue(message.hasExtension(optionalBytesExtension   ));

    Assert.assertTrue(message.hasExtension(optionalGroupExtension         ));
    Assert.assertTrue(message.hasExtension(optionalNestedMessageExtension ));
    Assert.assertTrue(message.hasExtension(optionalForeignMessageExtension));
    Assert.assertTrue(message.hasExtension(optionalImportMessageExtension ));

    Assert.assertTrue(message.getExtension(optionalGroupExtension         ).hasA());
    Assert.assertTrue(message.getExtension(optionalNestedMessageExtension ).hasBb());
    Assert.assertTrue(message.getExtension(optionalForeignMessageExtension).hasC());
    Assert.assertTrue(message.getExtension(optionalImportMessageExtension ).hasD());

    Assert.assertTrue(message.hasExtension(optionalNestedEnumExtension ));
    Assert.assertTrue(message.hasExtension(optionalForeignEnumExtension));
    Assert.assertTrue(message.hasExtension(optionalImportEnumExtension ));

    Assert.assertTrue(message.hasExtension(optionalStringPieceExtension));
    Assert.assertTrue(message.hasExtension(optionalCordExtension));

    assertEqualsExactType(101  , message.getExtension(optionalInt32Extension   ));
    assertEqualsExactType(102L , message.getExtension(optionalInt64Extension   ));
    assertEqualsExactType(103  , message.getExtension(optionalUint32Extension  ));
    assertEqualsExactType(104L , message.getExtension(optionalUint64Extension  ));
    assertEqualsExactType(105  , message.getExtension(optionalSint32Extension  ));
    assertEqualsExactType(106L , message.getExtension(optionalSint64Extension  ));
    assertEqualsExactType(107  , message.getExtension(optionalFixed32Extension ));
    assertEqualsExactType(108L , message.getExtension(optionalFixed64Extension ));
    assertEqualsExactType(109  , message.getExtension(optionalSfixed32Extension));
    assertEqualsExactType(110L , message.getExtension(optionalSfixed64Extension));
    assertEqualsExactType(111F , message.getExtension(optionalFloatExtension   ));
    assertEqualsExactType(112D , message.getExtension(optionalDoubleExtension  ));
    assertEqualsExactType(true , message.getExtension(optionalBoolExtension    ));
    assertEqualsExactType("115", message.getExtension(optionalStringExtension  ));
    assertEqualsExactType(toBytes("116"), message.getExtension(optionalBytesExtension));

    assertEqualsExactType(117, message.getExtension(optionalGroupExtension         ).getA());
    assertEqualsExactType(118, message.getExtension(optionalNestedMessageExtension ).getBb());
    assertEqualsExactType(119, message.getExtension(optionalForeignMessageExtension).getC());
    assertEqualsExactType(120, message.getExtension(optionalImportMessageExtension ).getD());

    assertEqualsExactType(TestAllTypes.NestedEnum.BAZ,
      message.getExtension(optionalNestedEnumExtension));
    assertEqualsExactType(ForeignEnum.FOREIGN_BAZ,
      message.getExtension(optionalForeignEnumExtension));
    assertEqualsExactType(ImportEnum.IMPORT_BAZ,
      message.getExtension(optionalImportEnumExtension));

    assertEqualsExactType("124", message.getExtension(optionalStringPieceExtension));
    assertEqualsExactType("125", message.getExtension(optionalCordExtension));

    // -----------------------------------------------------------------

    Assert.assertEquals(2, message.getExtensionCount(repeatedInt32Extension   ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedInt64Extension   ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedUint32Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedUint64Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedSint32Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedSint64Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedFixed32Extension ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedFixed64Extension ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedSfixed32Extension));
    Assert.assertEquals(2, message.getExtensionCount(repeatedSfixed64Extension));
    Assert.assertEquals(2, message.getExtensionCount(repeatedFloatExtension   ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedDoubleExtension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedBoolExtension    ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedStringExtension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedBytesExtension   ));

    Assert.assertEquals(2, message.getExtensionCount(repeatedGroupExtension         ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedNestedMessageExtension ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedForeignMessageExtension));
    Assert.assertEquals(2, message.getExtensionCount(repeatedImportMessageExtension ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedNestedEnumExtension    ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedForeignEnumExtension   ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedImportEnumExtension    ));

    Assert.assertEquals(2, message.getExtensionCount(repeatedStringPieceExtension));
    Assert.assertEquals(2, message.getExtensionCount(repeatedCordExtension));

    assertEqualsExactType(201  , message.getExtension(repeatedInt32Extension   , 0));
    assertEqualsExactType(202L , message.getExtension(repeatedInt64Extension   , 0));
    assertEqualsExactType(203  , message.getExtension(repeatedUint32Extension  , 0));
    assertEqualsExactType(204L , message.getExtension(repeatedUint64Extension  , 0));
    assertEqualsExactType(205  , message.getExtension(repeatedSint32Extension  , 0));
    assertEqualsExactType(206L , message.getExtension(repeatedSint64Extension  , 0));
    assertEqualsExactType(207  , message.getExtension(repeatedFixed32Extension , 0));
    assertEqualsExactType(208L , message.getExtension(repeatedFixed64Extension , 0));
    assertEqualsExactType(209  , message.getExtension(repeatedSfixed32Extension, 0));
    assertEqualsExactType(210L , message.getExtension(repeatedSfixed64Extension, 0));
    assertEqualsExactType(211F , message.getExtension(repeatedFloatExtension   , 0));
    assertEqualsExactType(212D , message.getExtension(repeatedDoubleExtension  , 0));
    assertEqualsExactType(true , message.getExtension(repeatedBoolExtension    , 0));
    assertEqualsExactType("215", message.getExtension(repeatedStringExtension  , 0));
    assertEqualsExactType(toBytes("216"), message.getExtension(repeatedBytesExtension, 0));

    assertEqualsExactType(217, message.getExtension(repeatedGroupExtension         , 0).getA());
    assertEqualsExactType(218, message.getExtension(repeatedNestedMessageExtension , 0).getBb());
    assertEqualsExactType(219, message.getExtension(repeatedForeignMessageExtension, 0).getC());
    assertEqualsExactType(220, message.getExtension(repeatedImportMessageExtension , 0).getD());

    assertEqualsExactType(TestAllTypes.NestedEnum.BAR,
      message.getExtension(repeatedNestedEnumExtension, 0));
    assertEqualsExactType(ForeignEnum.FOREIGN_BAR,
      message.getExtension(repeatedForeignEnumExtension, 0));
    assertEqualsExactType(ImportEnum.IMPORT_BAR,
      message.getExtension(repeatedImportEnumExtension, 0));

    assertEqualsExactType("224", message.getExtension(repeatedStringPieceExtension, 0));
    assertEqualsExactType("225", message.getExtension(repeatedCordExtension, 0));

    assertEqualsExactType(301  , message.getExtension(repeatedInt32Extension   , 1));
    assertEqualsExactType(302L , message.getExtension(repeatedInt64Extension   , 1));
    assertEqualsExactType(303  , message.getExtension(repeatedUint32Extension  , 1));
    assertEqualsExactType(304L , message.getExtension(repeatedUint64Extension  , 1));
    assertEqualsExactType(305  , message.getExtension(repeatedSint32Extension  , 1));
    assertEqualsExactType(306L , message.getExtension(repeatedSint64Extension  , 1));
    assertEqualsExactType(307  , message.getExtension(repeatedFixed32Extension , 1));
    assertEqualsExactType(308L , message.getExtension(repeatedFixed64Extension , 1));
    assertEqualsExactType(309  , message.getExtension(repeatedSfixed32Extension, 1));
    assertEqualsExactType(310L , message.getExtension(repeatedSfixed64Extension, 1));
    assertEqualsExactType(311F , message.getExtension(repeatedFloatExtension   , 1));
    assertEqualsExactType(312D , message.getExtension(repeatedDoubleExtension  , 1));
    assertEqualsExactType(false, message.getExtension(repeatedBoolExtension    , 1));
    assertEqualsExactType("315", message.getExtension(repeatedStringExtension  , 1));
    assertEqualsExactType(toBytes("316"), message.getExtension(repeatedBytesExtension, 1));

    assertEqualsExactType(317, message.getExtension(repeatedGroupExtension         , 1).getA());
    assertEqualsExactType(318, message.getExtension(repeatedNestedMessageExtension , 1).getBb());
    assertEqualsExactType(319, message.getExtension(repeatedForeignMessageExtension, 1).getC());
    assertEqualsExactType(320, message.getExtension(repeatedImportMessageExtension , 1).getD());

    assertEqualsExactType(TestAllTypes.NestedEnum.BAZ,
      message.getExtension(repeatedNestedEnumExtension, 1));
    assertEqualsExactType(ForeignEnum.FOREIGN_BAZ,
      message.getExtension(repeatedForeignEnumExtension, 1));
    assertEqualsExactType(ImportEnum.IMPORT_BAZ,
      message.getExtension(repeatedImportEnumExtension, 1));

    assertEqualsExactType("324", message.getExtension(repeatedStringPieceExtension, 1));
    assertEqualsExactType("325", message.getExtension(repeatedCordExtension, 1));

    // -----------------------------------------------------------------

    Assert.assertTrue(message.hasExtension(defaultInt32Extension   ));
    Assert.assertTrue(message.hasExtension(defaultInt64Extension   ));
    Assert.assertTrue(message.hasExtension(defaultUint32Extension  ));
    Assert.assertTrue(message.hasExtension(defaultUint64Extension  ));
    Assert.assertTrue(message.hasExtension(defaultSint32Extension  ));
    Assert.assertTrue(message.hasExtension(defaultSint64Extension  ));
    Assert.assertTrue(message.hasExtension(defaultFixed32Extension ));
    Assert.assertTrue(message.hasExtension(defaultFixed64Extension ));
    Assert.assertTrue(message.hasExtension(defaultSfixed32Extension));
    Assert.assertTrue(message.hasExtension(defaultSfixed64Extension));
    Assert.assertTrue(message.hasExtension(defaultFloatExtension   ));
    Assert.assertTrue(message.hasExtension(defaultDoubleExtension  ));
    Assert.assertTrue(message.hasExtension(defaultBoolExtension    ));
    Assert.assertTrue(message.hasExtension(defaultStringExtension  ));
    Assert.assertTrue(message.hasExtension(defaultBytesExtension   ));

    Assert.assertTrue(message.hasExtension(defaultNestedEnumExtension ));
    Assert.assertTrue(message.hasExtension(defaultForeignEnumExtension));
    Assert.assertTrue(message.hasExtension(defaultImportEnumExtension ));

    Assert.assertTrue(message.hasExtension(defaultStringPieceExtension));
    Assert.assertTrue(message.hasExtension(defaultCordExtension));

    assertEqualsExactType(401  , message.getExtension(defaultInt32Extension   ));
    assertEqualsExactType(402L , message.getExtension(defaultInt64Extension   ));
    assertEqualsExactType(403  , message.getExtension(defaultUint32Extension  ));
    assertEqualsExactType(404L , message.getExtension(defaultUint64Extension  ));
    assertEqualsExactType(405  , message.getExtension(defaultSint32Extension  ));
    assertEqualsExactType(406L , message.getExtension(defaultSint64Extension  ));
    assertEqualsExactType(407  , message.getExtension(defaultFixed32Extension ));
    assertEqualsExactType(408L , message.getExtension(defaultFixed64Extension ));
    assertEqualsExactType(409  , message.getExtension(defaultSfixed32Extension));
    assertEqualsExactType(410L , message.getExtension(defaultSfixed64Extension));
    assertEqualsExactType(411F , message.getExtension(defaultFloatExtension   ));
    assertEqualsExactType(412D , message.getExtension(defaultDoubleExtension  ));
    assertEqualsExactType(false, message.getExtension(defaultBoolExtension    ));
    assertEqualsExactType("415", message.getExtension(defaultStringExtension  ));
    assertEqualsExactType(toBytes("416"), message.getExtension(defaultBytesExtension));

    assertEqualsExactType(TestAllTypes.NestedEnum.FOO,
      message.getExtension(defaultNestedEnumExtension ));
    assertEqualsExactType(ForeignEnum.FOREIGN_FOO,
      message.getExtension(defaultForeignEnumExtension));
    assertEqualsExactType(ImportEnum.IMPORT_FOO,
      message.getExtension(defaultImportEnumExtension));

    assertEqualsExactType("424", message.getExtension(defaultStringPieceExtension));
    assertEqualsExactType("425", message.getExtension(defaultCordExtension));
  }

  // -------------------------------------------------------------------

  /**
   * Assert (using {@code junit.framework.Assert}} that all extensions of
   * {@code message} are cleared, and that getting the extensions returns their
   * default values.
   */
  public static void assertExtensionsClear(TestAllExtensions message) {
    // hasBlah() should initially be false for all optional fields.
    Assert.assertFalse(message.hasExtension(optionalInt32Extension   ));
    Assert.assertFalse(message.hasExtension(optionalInt64Extension   ));
    Assert.assertFalse(message.hasExtension(optionalUint32Extension  ));
    Assert.assertFalse(message.hasExtension(optionalUint64Extension  ));
    Assert.assertFalse(message.hasExtension(optionalSint32Extension  ));
    Assert.assertFalse(message.hasExtension(optionalSint64Extension  ));
    Assert.assertFalse(message.hasExtension(optionalFixed32Extension ));
    Assert.assertFalse(message.hasExtension(optionalFixed64Extension ));
    Assert.assertFalse(message.hasExtension(optionalSfixed32Extension));
    Assert.assertFalse(message.hasExtension(optionalSfixed64Extension));
    Assert.assertFalse(message.hasExtension(optionalFloatExtension   ));
    Assert.assertFalse(message.hasExtension(optionalDoubleExtension  ));
    Assert.assertFalse(message.hasExtension(optionalBoolExtension    ));
    Assert.assertFalse(message.hasExtension(optionalStringExtension  ));
    Assert.assertFalse(message.hasExtension(optionalBytesExtension   ));

    Assert.assertFalse(message.hasExtension(optionalGroupExtension         ));
    Assert.assertFalse(message.hasExtension(optionalNestedMessageExtension ));
    Assert.assertFalse(message.hasExtension(optionalForeignMessageExtension));
    Assert.assertFalse(message.hasExtension(optionalImportMessageExtension ));

    Assert.assertFalse(message.hasExtension(optionalNestedEnumExtension ));
    Assert.assertFalse(message.hasExtension(optionalForeignEnumExtension));
    Assert.assertFalse(message.hasExtension(optionalImportEnumExtension ));

    Assert.assertFalse(message.hasExtension(optionalStringPieceExtension));
    Assert.assertFalse(message.hasExtension(optionalCordExtension));

    // Optional fields without defaults are set to zero or something like it.
    assertEqualsExactType(0    , message.getExtension(optionalInt32Extension   ));
    assertEqualsExactType(0L   , message.getExtension(optionalInt64Extension   ));
    assertEqualsExactType(0    , message.getExtension(optionalUint32Extension  ));
    assertEqualsExactType(0L   , message.getExtension(optionalUint64Extension  ));
    assertEqualsExactType(0    , message.getExtension(optionalSint32Extension  ));
    assertEqualsExactType(0L   , message.getExtension(optionalSint64Extension  ));
    assertEqualsExactType(0    , message.getExtension(optionalFixed32Extension ));
    assertEqualsExactType(0L   , message.getExtension(optionalFixed64Extension ));
    assertEqualsExactType(0    , message.getExtension(optionalSfixed32Extension));
    assertEqualsExactType(0L   , message.getExtension(optionalSfixed64Extension));
    assertEqualsExactType(0F   , message.getExtension(optionalFloatExtension   ));
    assertEqualsExactType(0D   , message.getExtension(optionalDoubleExtension  ));
    assertEqualsExactType(false, message.getExtension(optionalBoolExtension    ));
    assertEqualsExactType(""   , message.getExtension(optionalStringExtension  ));
    assertEqualsExactType(ByteString.EMPTY, message.getExtension(optionalBytesExtension));

    // Embedded messages should also be clear.
    Assert.assertFalse(message.getExtension(optionalGroupExtension         ).hasA());
    Assert.assertFalse(message.getExtension(optionalNestedMessageExtension ).hasBb());
    Assert.assertFalse(message.getExtension(optionalForeignMessageExtension).hasC());
    Assert.assertFalse(message.getExtension(optionalImportMessageExtension ).hasD());

    assertEqualsExactType(0, message.getExtension(optionalGroupExtension         ).getA());
    assertEqualsExactType(0, message.getExtension(optionalNestedMessageExtension ).getBb());
    assertEqualsExactType(0, message.getExtension(optionalForeignMessageExtension).getC());
    assertEqualsExactType(0, message.getExtension(optionalImportMessageExtension ).getD());

    // Enums without defaults are set to the first value in the enum.
    assertEqualsExactType(TestAllTypes.NestedEnum.FOO,
      message.getExtension(optionalNestedEnumExtension ));
    assertEqualsExactType(ForeignEnum.FOREIGN_FOO,
      message.getExtension(optionalForeignEnumExtension));
    assertEqualsExactType(ImportEnum.IMPORT_FOO,
      message.getExtension(optionalImportEnumExtension));

    assertEqualsExactType("", message.getExtension(optionalStringPieceExtension));
    assertEqualsExactType("", message.getExtension(optionalCordExtension));

    // Repeated fields are empty.
    Assert.assertEquals(0, message.getExtensionCount(repeatedInt32Extension   ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedInt64Extension   ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedUint32Extension  ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedUint64Extension  ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedSint32Extension  ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedSint64Extension  ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedFixed32Extension ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedFixed64Extension ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedSfixed32Extension));
    Assert.assertEquals(0, message.getExtensionCount(repeatedSfixed64Extension));
    Assert.assertEquals(0, message.getExtensionCount(repeatedFloatExtension   ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedDoubleExtension  ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedBoolExtension    ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedStringExtension  ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedBytesExtension   ));

    Assert.assertEquals(0, message.getExtensionCount(repeatedGroupExtension         ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedNestedMessageExtension ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedForeignMessageExtension));
    Assert.assertEquals(0, message.getExtensionCount(repeatedImportMessageExtension ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedNestedEnumExtension    ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedForeignEnumExtension   ));
    Assert.assertEquals(0, message.getExtensionCount(repeatedImportEnumExtension    ));

    Assert.assertEquals(0, message.getExtensionCount(repeatedStringPieceExtension));
    Assert.assertEquals(0, message.getExtensionCount(repeatedCordExtension));

    // hasBlah() should also be false for all default fields.
    Assert.assertFalse(message.hasExtension(defaultInt32Extension   ));
    Assert.assertFalse(message.hasExtension(defaultInt64Extension   ));
    Assert.assertFalse(message.hasExtension(defaultUint32Extension  ));
    Assert.assertFalse(message.hasExtension(defaultUint64Extension  ));
    Assert.assertFalse(message.hasExtension(defaultSint32Extension  ));
    Assert.assertFalse(message.hasExtension(defaultSint64Extension  ));
    Assert.assertFalse(message.hasExtension(defaultFixed32Extension ));
    Assert.assertFalse(message.hasExtension(defaultFixed64Extension ));
    Assert.assertFalse(message.hasExtension(defaultSfixed32Extension));
    Assert.assertFalse(message.hasExtension(defaultSfixed64Extension));
    Assert.assertFalse(message.hasExtension(defaultFloatExtension   ));
    Assert.assertFalse(message.hasExtension(defaultDoubleExtension  ));
    Assert.assertFalse(message.hasExtension(defaultBoolExtension    ));
    Assert.assertFalse(message.hasExtension(defaultStringExtension  ));
    Assert.assertFalse(message.hasExtension(defaultBytesExtension   ));

    Assert.assertFalse(message.hasExtension(defaultNestedEnumExtension ));
    Assert.assertFalse(message.hasExtension(defaultForeignEnumExtension));
    Assert.assertFalse(message.hasExtension(defaultImportEnumExtension ));

    Assert.assertFalse(message.hasExtension(defaultStringPieceExtension));
    Assert.assertFalse(message.hasExtension(defaultCordExtension));

    // Fields with defaults have their default values (duh).
    assertEqualsExactType( 41    , message.getExtension(defaultInt32Extension   ));
    assertEqualsExactType( 42L   , message.getExtension(defaultInt64Extension   ));
    assertEqualsExactType( 43    , message.getExtension(defaultUint32Extension  ));
    assertEqualsExactType( 44L   , message.getExtension(defaultUint64Extension  ));
    assertEqualsExactType(-45    , message.getExtension(defaultSint32Extension  ));
    assertEqualsExactType( 46L   , message.getExtension(defaultSint64Extension  ));
    assertEqualsExactType( 47    , message.getExtension(defaultFixed32Extension ));
    assertEqualsExactType( 48L   , message.getExtension(defaultFixed64Extension ));
    assertEqualsExactType( 49    , message.getExtension(defaultSfixed32Extension));
    assertEqualsExactType(-50L   , message.getExtension(defaultSfixed64Extension));
    assertEqualsExactType( 51.5F , message.getExtension(defaultFloatExtension   ));
    assertEqualsExactType( 52e3D , message.getExtension(defaultDoubleExtension  ));
    assertEqualsExactType(true   , message.getExtension(defaultBoolExtension    ));
    assertEqualsExactType("hello", message.getExtension(defaultStringExtension  ));
    assertEqualsExactType(toBytes("world"), message.getExtension(defaultBytesExtension));

    assertEqualsExactType(TestAllTypes.NestedEnum.BAR,
      message.getExtension(defaultNestedEnumExtension ));
    assertEqualsExactType(ForeignEnum.FOREIGN_BAR,
      message.getExtension(defaultForeignEnumExtension));
    assertEqualsExactType(ImportEnum.IMPORT_BAR,
      message.getExtension(defaultImportEnumExtension));

    assertEqualsExactType("abc", message.getExtension(defaultStringPieceExtension));
    assertEqualsExactType("123", message.getExtension(defaultCordExtension));
  }

  // -------------------------------------------------------------------

  /**
   * Assert (using {@code junit.framework.Assert}} that all extensions of
   * {@code message} are set to the values assigned by {@code setAllExtensions}
   * followed by {@code modifyRepeatedExtensions}.
   */
  public static void assertRepeatedExtensionsModified(
      TestAllExtensions message) {
    // ModifyRepeatedFields only sets the second repeated element of each
    // field.  In addition to verifying this, we also verify that the first
    // element and size were *not* modified.
    Assert.assertEquals(2, message.getExtensionCount(repeatedInt32Extension   ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedInt64Extension   ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedUint32Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedUint64Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedSint32Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedSint64Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedFixed32Extension ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedFixed64Extension ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedSfixed32Extension));
    Assert.assertEquals(2, message.getExtensionCount(repeatedSfixed64Extension));
    Assert.assertEquals(2, message.getExtensionCount(repeatedFloatExtension   ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedDoubleExtension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedBoolExtension    ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedStringExtension  ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedBytesExtension   ));

    Assert.assertEquals(2, message.getExtensionCount(repeatedGroupExtension         ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedNestedMessageExtension ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedForeignMessageExtension));
    Assert.assertEquals(2, message.getExtensionCount(repeatedImportMessageExtension ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedNestedEnumExtension    ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedForeignEnumExtension   ));
    Assert.assertEquals(2, message.getExtensionCount(repeatedImportEnumExtension    ));

    Assert.assertEquals(2, message.getExtensionCount(repeatedStringPieceExtension));
    Assert.assertEquals(2, message.getExtensionCount(repeatedCordExtension));

    assertEqualsExactType(201  , message.getExtension(repeatedInt32Extension   , 0));
    assertEqualsExactType(202L , message.getExtension(repeatedInt64Extension   , 0));
    assertEqualsExactType(203  , message.getExtension(repeatedUint32Extension  , 0));
    assertEqualsExactType(204L , message.getExtension(repeatedUint64Extension  , 0));
    assertEqualsExactType(205  , message.getExtension(repeatedSint32Extension  , 0));
    assertEqualsExactType(206L , message.getExtension(repeatedSint64Extension  , 0));
    assertEqualsExactType(207  , message.getExtension(repeatedFixed32Extension , 0));
    assertEqualsExactType(208L , message.getExtension(repeatedFixed64Extension , 0));
    assertEqualsExactType(209  , message.getExtension(repeatedSfixed32Extension, 0));
    assertEqualsExactType(210L , message.getExtension(repeatedSfixed64Extension, 0));
    assertEqualsExactType(211F , message.getExtension(repeatedFloatExtension   , 0));
    assertEqualsExactType(212D , message.getExtension(repeatedDoubleExtension  , 0));
    assertEqualsExactType(true , message.getExtension(repeatedBoolExtension    , 0));
    assertEqualsExactType("215", message.getExtension(repeatedStringExtension  , 0));
    assertEqualsExactType(toBytes("216"), message.getExtension(repeatedBytesExtension, 0));

    assertEqualsExactType(217, message.getExtension(repeatedGroupExtension         , 0).getA());
    assertEqualsExactType(218, message.getExtension(repeatedNestedMessageExtension , 0).getBb());
    assertEqualsExactType(219, message.getExtension(repeatedForeignMessageExtension, 0).getC());
    assertEqualsExactType(220, message.getExtension(repeatedImportMessageExtension , 0).getD());

    assertEqualsExactType(TestAllTypes.NestedEnum.BAR,
      message.getExtension(repeatedNestedEnumExtension, 0));
    assertEqualsExactType(ForeignEnum.FOREIGN_BAR,
      message.getExtension(repeatedForeignEnumExtension, 0));
    assertEqualsExactType(ImportEnum.IMPORT_BAR,
      message.getExtension(repeatedImportEnumExtension, 0));

    assertEqualsExactType("224", message.getExtension(repeatedStringPieceExtension, 0));
    assertEqualsExactType("225", message.getExtension(repeatedCordExtension, 0));

    // Actually verify the second (modified) elements now.
    assertEqualsExactType(501  , message.getExtension(repeatedInt32Extension   , 1));
    assertEqualsExactType(502L , message.getExtension(repeatedInt64Extension   , 1));
    assertEqualsExactType(503  , message.getExtension(repeatedUint32Extension  , 1));
    assertEqualsExactType(504L , message.getExtension(repeatedUint64Extension  , 1));
    assertEqualsExactType(505  , message.getExtension(repeatedSint32Extension  , 1));
    assertEqualsExactType(506L , message.getExtension(repeatedSint64Extension  , 1));
    assertEqualsExactType(507  , message.getExtension(repeatedFixed32Extension , 1));
    assertEqualsExactType(508L , message.getExtension(repeatedFixed64Extension , 1));
    assertEqualsExactType(509  , message.getExtension(repeatedSfixed32Extension, 1));
    assertEqualsExactType(510L , message.getExtension(repeatedSfixed64Extension, 1));
    assertEqualsExactType(511F , message.getExtension(repeatedFloatExtension   , 1));
    assertEqualsExactType(512D , message.getExtension(repeatedDoubleExtension  , 1));
    assertEqualsExactType(true , message.getExtension(repeatedBoolExtension    , 1));
    assertEqualsExactType("515", message.getExtension(repeatedStringExtension  , 1));
    assertEqualsExactType(toBytes("516"), message.getExtension(repeatedBytesExtension, 1));

    assertEqualsExactType(517, message.getExtension(repeatedGroupExtension         , 1).getA());
    assertEqualsExactType(518, message.getExtension(repeatedNestedMessageExtension , 1).getBb());
    assertEqualsExactType(519, message.getExtension(repeatedForeignMessageExtension, 1).getC());
    assertEqualsExactType(520, message.getExtension(repeatedImportMessageExtension , 1).getD());

    assertEqualsExactType(TestAllTypes.NestedEnum.FOO,
      message.getExtension(repeatedNestedEnumExtension, 1));
    assertEqualsExactType(ForeignEnum.FOREIGN_FOO,
      message.getExtension(repeatedForeignEnumExtension, 1));
    assertEqualsExactType(ImportEnum.IMPORT_FOO,
      message.getExtension(repeatedImportEnumExtension, 1));

    assertEqualsExactType("524", message.getExtension(repeatedStringPieceExtension, 1));
    assertEqualsExactType("525", message.getExtension(repeatedCordExtension, 1));
  }

  /**
   * Set every field of {@code message} to a unique value.
   */
  public static void setPackedFields(TestPackedTypes.Builder message) {
    message.addPackedInt32   (601);
    message.addPackedInt64   (602);
    message.addPackedUint32  (603);
    message.addPackedUint64  (604);
    message.addPackedSint32  (605);
    message.addPackedSint64  (606);
    message.addPackedFixed32 (607);
    message.addPackedFixed64 (608);
    message.addPackedSfixed32(609);
    message.addPackedSfixed64(610);
    message.addPackedFloat   (611);
    message.addPackedDouble  (612);
    message.addPackedBool    (true);
    message.addPackedEnum    (ForeignEnum.FOREIGN_BAR);
    // Add a second one of each field.
    message.addPackedInt32   (701);
    message.addPackedInt64   (702);
    message.addPackedUint32  (703);
    message.addPackedUint64  (704);
    message.addPackedSint32  (705);
    message.addPackedSint64  (706);
    message.addPackedFixed32 (707);
    message.addPackedFixed64 (708);
    message.addPackedSfixed32(709);
    message.addPackedSfixed64(710);
    message.addPackedFloat   (711);
    message.addPackedDouble  (712);
    message.addPackedBool    (false);
    message.addPackedEnum    (ForeignEnum.FOREIGN_BAZ);
  }

  /**
   * Assert (using {@code junit.framework.Assert}} that all fields of
   * {@code message} are set to the values assigned by {@code setPackedFields}.
   */
  public static void assertPackedFieldsSet(TestPackedTypes message) {
    Assert.assertEquals(2, message.getPackedInt32Count   ());
    Assert.assertEquals(2, message.getPackedInt64Count   ());
    Assert.assertEquals(2, message.getPackedUint32Count  ());
    Assert.assertEquals(2, message.getPackedUint64Count  ());
    Assert.assertEquals(2, message.getPackedSint32Count  ());
    Assert.assertEquals(2, message.getPackedSint64Count  ());
    Assert.assertEquals(2, message.getPackedFixed32Count ());
    Assert.assertEquals(2, message.getPackedFixed64Count ());
    Assert.assertEquals(2, message.getPackedSfixed32Count());
    Assert.assertEquals(2, message.getPackedSfixed64Count());
    Assert.assertEquals(2, message.getPackedFloatCount   ());
    Assert.assertEquals(2, message.getPackedDoubleCount  ());
    Assert.assertEquals(2, message.getPackedBoolCount    ());
    Assert.assertEquals(2, message.getPackedEnumCount   ());
    Assert.assertEquals(601  , message.getPackedInt32   (0));
    Assert.assertEquals(602  , message.getPackedInt64   (0));
    Assert.assertEquals(603  , message.getPackedUint32  (0));
    Assert.assertEquals(604  , message.getPackedUint64  (0));
    Assert.assertEquals(605  , message.getPackedSint32  (0));
    Assert.assertEquals(606  , message.getPackedSint64  (0));
    Assert.assertEquals(607  , message.getPackedFixed32 (0));
    Assert.assertEquals(608  , message.getPackedFixed64 (0));
    Assert.assertEquals(609  , message.getPackedSfixed32(0));
    Assert.assertEquals(610  , message.getPackedSfixed64(0));
    Assert.assertEquals(611  , message.getPackedFloat   (0), 0.0);
    Assert.assertEquals(612  , message.getPackedDouble  (0), 0.0);
    Assert.assertEquals(true , message.getPackedBool    (0));
    Assert.assertEquals(ForeignEnum.FOREIGN_BAR, message.getPackedEnum(0));
    Assert.assertEquals(701  , message.getPackedInt32   (1));
    Assert.assertEquals(702  , message.getPackedInt64   (1));
    Assert.assertEquals(703  , message.getPackedUint32  (1));
    Assert.assertEquals(704  , message.getPackedUint64  (1));
    Assert.assertEquals(705  , message.getPackedSint32  (1));
    Assert.assertEquals(706  , message.getPackedSint64  (1));
    Assert.assertEquals(707  , message.getPackedFixed32 (1));
    Assert.assertEquals(708  , message.getPackedFixed64 (1));
    Assert.assertEquals(709  , message.getPackedSfixed32(1));
    Assert.assertEquals(710  , message.getPackedSfixed64(1));
    Assert.assertEquals(711  , message.getPackedFloat   (1), 0.0);
    Assert.assertEquals(712  , message.getPackedDouble  (1), 0.0);
    Assert.assertEquals(false, message.getPackedBool    (1));
    Assert.assertEquals(ForeignEnum.FOREIGN_BAZ, message.getPackedEnum(1));
  }

  public static void setPackedExtensions(TestPackedExtensions.Builder message) {
    message.addExtension(packedInt32Extension   , 601);
    message.addExtension(packedInt64Extension   , 602L);
    message.addExtension(packedUint32Extension  , 603);
    message.addExtension(packedUint64Extension  , 604L);
    message.addExtension(packedSint32Extension  , 605);
    message.addExtension(packedSint64Extension  , 606L);
    message.addExtension(packedFixed32Extension , 607);
    message.addExtension(packedFixed64Extension , 608L);
    message.addExtension(packedSfixed32Extension, 609);
    message.addExtension(packedSfixed64Extension, 610L);
    message.addExtension(packedFloatExtension   , 611F);
    message.addExtension(packedDoubleExtension  , 612D);
    message.addExtension(packedBoolExtension    , true);
    message.addExtension(packedEnumExtension, ForeignEnum.FOREIGN_BAR);
    // Add a second one of each field.
    message.addExtension(packedInt32Extension   , 701);
    message.addExtension(packedInt64Extension   , 702L);
    message.addExtension(packedUint32Extension  , 703);
    message.addExtension(packedUint64Extension  , 704L);
    message.addExtension(packedSint32Extension  , 705);
    message.addExtension(packedSint64Extension  , 706L);
    message.addExtension(packedFixed32Extension , 707);
    message.addExtension(packedFixed64Extension , 708L);
    message.addExtension(packedSfixed32Extension, 709);
    message.addExtension(packedSfixed64Extension, 710L);
    message.addExtension(packedFloatExtension   , 711F);
    message.addExtension(packedDoubleExtension  , 712D);
    message.addExtension(packedBoolExtension    , false);
    message.addExtension(packedEnumExtension, ForeignEnum.FOREIGN_BAZ);
  }

  public static void assertPackedExtensionsSet(TestPackedExtensions message) {
    Assert.assertEquals(2, message.getExtensionCount(packedInt32Extension   ));
    Assert.assertEquals(2, message.getExtensionCount(packedInt64Extension   ));
    Assert.assertEquals(2, message.getExtensionCount(packedUint32Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(packedUint64Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(packedSint32Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(packedSint64Extension  ));
    Assert.assertEquals(2, message.getExtensionCount(packedFixed32Extension ));
    Assert.assertEquals(2, message.getExtensionCount(packedFixed64Extension ));
    Assert.assertEquals(2, message.getExtensionCount(packedSfixed32Extension));
    Assert.assertEquals(2, message.getExtensionCount(packedSfixed64Extension));
    Assert.assertEquals(2, message.getExtensionCount(packedFloatExtension   ));
    Assert.assertEquals(2, message.getExtensionCount(packedDoubleExtension  ));
    Assert.assertEquals(2, message.getExtensionCount(packedBoolExtension    ));
    Assert.assertEquals(2, message.getExtensionCount(packedEnumExtension));
    assertEqualsExactType(601  , message.getExtension(packedInt32Extension   , 0));
    assertEqualsExactType(602L , message.getExtension(packedInt64Extension   , 0));
    assertEqualsExactType(603  , message.getExtension(packedUint32Extension  , 0));
    assertEqualsExactType(604L , message.getExtension(packedUint64Extension  , 0));
    assertEqualsExactType(605  , message.getExtension(packedSint32Extension  , 0));
    assertEqualsExactType(606L , message.getExtension(packedSint64Extension  , 0));
    assertEqualsExactType(607  , message.getExtension(packedFixed32Extension , 0));
    assertEqualsExactType(608L , message.getExtension(packedFixed64Extension , 0));
    assertEqualsExactType(609  , message.getExtension(packedSfixed32Extension, 0));
    assertEqualsExactType(610L , message.getExtension(packedSfixed64Extension, 0));
    assertEqualsExactType(611F , message.getExtension(packedFloatExtension   , 0));
    assertEqualsExactType(612D , message.getExtension(packedDoubleExtension  , 0));
    assertEqualsExactType(true , message.getExtension(packedBoolExtension    , 0));
    assertEqualsExactType(ForeignEnum.FOREIGN_BAR,
                          message.getExtension(packedEnumExtension, 0));
    assertEqualsExactType(701  , message.getExtension(packedInt32Extension   , 1));
    assertEqualsExactType(702L , message.getExtension(packedInt64Extension   , 1));
    assertEqualsExactType(703  , message.getExtension(packedUint32Extension  , 1));
    assertEqualsExactType(704L , message.getExtension(packedUint64Extension  , 1));
    assertEqualsExactType(705  , message.getExtension(packedSint32Extension  , 1));
    assertEqualsExactType(706L , message.getExtension(packedSint64Extension  , 1));
    assertEqualsExactType(707  , message.getExtension(packedFixed32Extension , 1));
    assertEqualsExactType(708L , message.getExtension(packedFixed64Extension , 1));
    assertEqualsExactType(709  , message.getExtension(packedSfixed32Extension, 1));
    assertEqualsExactType(710L , message.getExtension(packedSfixed64Extension, 1));
    assertEqualsExactType(711F , message.getExtension(packedFloatExtension   , 1));
    assertEqualsExactType(712D , message.getExtension(packedDoubleExtension  , 1));
    assertEqualsExactType(false, message.getExtension(packedBoolExtension    , 1));
    assertEqualsExactType(ForeignEnum.FOREIGN_BAZ,
                          message.getExtension(packedEnumExtension, 1));
  }


  // ===================================================================

  /**
   * Performs the same things that the methods of {@code TestUtil} do, but
   * via the reflection interface.  This is its own class because it needs
   * to know what descriptor to use.
   */
  public static class ReflectionTester {
    private final Descriptors.Descriptor baseDescriptor;
    private final ExtensionRegistry extensionRegistry;

    private final Descriptors.FileDescriptor file;
    private final Descriptors.FileDescriptor importFile;

    private final Descriptors.Descriptor optionalGroup;
    private final Descriptors.Descriptor repeatedGroup;
    private final Descriptors.Descriptor nestedMessage;
    private final Descriptors.Descriptor foreignMessage;
    private final Descriptors.Descriptor importMessage;

    private final Descriptors.FieldDescriptor groupA;
    private final Descriptors.FieldDescriptor repeatedGroupA;
    private final Descriptors.FieldDescriptor nestedB;
    private final Descriptors.FieldDescriptor foreignC;
    private final Descriptors.FieldDescriptor importD;

    private final Descriptors.EnumDescriptor nestedEnum;
    private final Descriptors.EnumDescriptor foreignEnum;
    private final Descriptors.EnumDescriptor importEnum;

    private final Descriptors.EnumValueDescriptor nestedFoo;
    private final Descriptors.EnumValueDescriptor nestedBar;
    private final Descriptors.EnumValueDescriptor nestedBaz;
    private final Descriptors.EnumValueDescriptor foreignFoo;
    private final Descriptors.EnumValueDescriptor foreignBar;
    private final Descriptors.EnumValueDescriptor foreignBaz;
    private final Descriptors.EnumValueDescriptor importFoo;
    private final Descriptors.EnumValueDescriptor importBar;
    private final Descriptors.EnumValueDescriptor importBaz;

    /**
     * Construct a {@code ReflectionTester} that will expect messages using
     * the given descriptor.
     *
     * Normally {@code baseDescriptor} should be a descriptor for the type
     * {@code TestAllTypes}, defined in
     * {@code google/protobuf/unittest.proto}.  However, if
     * {@code extensionRegistry} is non-null, then {@code baseDescriptor} should
     * be for {@code TestAllExtensions} instead, and instead of reading and
     * writing normal fields, the tester will read and write extensions.
     * All of {@code TestAllExtensions}' extensions must be registered in the
     * registry.
     */
    public ReflectionTester(Descriptors.Descriptor baseDescriptor,
                            ExtensionRegistry extensionRegistry) {
      this.baseDescriptor = baseDescriptor;
      this.extensionRegistry = extensionRegistry;

      this.file = baseDescriptor.getFile();
      Assert.assertEquals(1, file.getDependencies().size());
      this.importFile = file.getDependencies().get(0);

      Descriptors.Descriptor testAllTypes;
      if (baseDescriptor.getName() == "TestAllTypes") {
        testAllTypes = baseDescriptor;
      } else {
        testAllTypes = file.findMessageTypeByName("TestAllTypes");
        Assert.assertNotNull(testAllTypes);
      }

      if (extensionRegistry == null) {
        // Use testAllTypes, rather than baseDescriptor, to allow
        // initialization using TestPackedTypes descriptors. These objects
        // won't be used by the methods for packed fields.
        this.optionalGroup =
          testAllTypes.findNestedTypeByName("OptionalGroup");
        this.repeatedGroup =
          testAllTypes.findNestedTypeByName("RepeatedGroup");
      } else {
        this.optionalGroup =
          file.findMessageTypeByName("OptionalGroup_extension");
        this.repeatedGroup =
          file.findMessageTypeByName("RepeatedGroup_extension");
      }
      this.nestedMessage = testAllTypes.findNestedTypeByName("NestedMessage");
      this.foreignMessage = file.findMessageTypeByName("ForeignMessage");
      this.importMessage = importFile.findMessageTypeByName("ImportMessage");

      this.nestedEnum = testAllTypes.findEnumTypeByName("NestedEnum");
      this.foreignEnum = file.findEnumTypeByName("ForeignEnum");
      this.importEnum = importFile.findEnumTypeByName("ImportEnum");

      Assert.assertNotNull(optionalGroup );
      Assert.assertNotNull(repeatedGroup );
      Assert.assertNotNull(nestedMessage );
      Assert.assertNotNull(foreignMessage);
      Assert.assertNotNull(importMessage );
      Assert.assertNotNull(nestedEnum    );
      Assert.assertNotNull(foreignEnum   );
      Assert.assertNotNull(importEnum    );

      this.nestedB  = nestedMessage .findFieldByName("bb");
      this.foreignC = foreignMessage.findFieldByName("c");
      this.importD  = importMessage .findFieldByName("d");
      this.nestedFoo = nestedEnum.findValueByName("FOO");
      this.nestedBar = nestedEnum.findValueByName("BAR");
      this.nestedBaz = nestedEnum.findValueByName("BAZ");
      this.foreignFoo = foreignEnum.findValueByName("FOREIGN_FOO");
      this.foreignBar = foreignEnum.findValueByName("FOREIGN_BAR");
      this.foreignBaz = foreignEnum.findValueByName("FOREIGN_BAZ");
      this.importFoo = importEnum.findValueByName("IMPORT_FOO");
      this.importBar = importEnum.findValueByName("IMPORT_BAR");
      this.importBaz = importEnum.findValueByName("IMPORT_BAZ");

      this.groupA = optionalGroup.findFieldByName("a");
      this.repeatedGroupA = repeatedGroup.findFieldByName("a");

      Assert.assertNotNull(groupA        );
      Assert.assertNotNull(repeatedGroupA);
      Assert.assertNotNull(nestedB       );
      Assert.assertNotNull(foreignC      );
      Assert.assertNotNull(importD       );
      Assert.assertNotNull(nestedFoo     );
      Assert.assertNotNull(nestedBar     );
      Assert.assertNotNull(nestedBaz     );
      Assert.assertNotNull(foreignFoo    );
      Assert.assertNotNull(foreignBar    );
      Assert.assertNotNull(foreignBaz    );
      Assert.assertNotNull(importFoo     );
      Assert.assertNotNull(importBar     );
      Assert.assertNotNull(importBaz     );
    }

    /**
     * Shorthand to get a FieldDescriptor for a field of unittest::TestAllTypes.
     */
    private Descriptors.FieldDescriptor f(String name) {
      Descriptors.FieldDescriptor result;
      if (extensionRegistry == null) {
        result = baseDescriptor.findFieldByName(name);
      } else {
        result = file.findExtensionByName(name + "_extension");
      }
      Assert.assertNotNull(result);
      return result;
    }

    /**
     * Calls {@code parent.newBuilderForField()} or uses the
     * {@code ExtensionRegistry} to find an appropriate builder, depending
     * on what type is being tested.
     */
    private Message.Builder newBuilderForField(
        Message.Builder parent, Descriptors.FieldDescriptor field) {
      if (extensionRegistry == null) {
        return parent.newBuilderForField(field);
      } else {
        ExtensionRegistry.ExtensionInfo extension =
          extensionRegistry.findExtensionByNumber(field.getContainingType(),
                                                  field.getNumber());
        Assert.assertNotNull(extension);
        Assert.assertNotNull(extension.defaultInstance);
        return extension.defaultInstance.newBuilderForType();
      }
    }

    // -------------------------------------------------------------------

    /**
     * Set every field of {@code message} to the values expected by
     * {@code assertAllFieldsSet()}, using the {@link Message.Builder}
     * reflection interface.
     */
    void setAllFieldsViaReflection(Message.Builder message) {
      message.setField(f("optional_int32"   ), 101 );
      message.setField(f("optional_int64"   ), 102L);
      message.setField(f("optional_uint32"  ), 103 );
      message.setField(f("optional_uint64"  ), 104L);
      message.setField(f("optional_sint32"  ), 105 );
      message.setField(f("optional_sint64"  ), 106L);
      message.setField(f("optional_fixed32" ), 107 );
      message.setField(f("optional_fixed64" ), 108L);
      message.setField(f("optional_sfixed32"), 109 );
      message.setField(f("optional_sfixed64"), 110L);
      message.setField(f("optional_float"   ), 111F);
      message.setField(f("optional_double"  ), 112D);
      message.setField(f("optional_bool"    ), true);
      message.setField(f("optional_string"  ), "115");
      message.setField(f("optional_bytes"   ), toBytes("116"));

      message.setField(f("optionalgroup"),
        newBuilderForField(message, f("optionalgroup"))
               .setField(groupA, 117).build());
      message.setField(f("optional_nested_message"),
        newBuilderForField(message, f("optional_nested_message"))
               .setField(nestedB, 118).build());
      message.setField(f("optional_foreign_message"),
        newBuilderForField(message, f("optional_foreign_message"))
               .setField(foreignC, 119).build());
      message.setField(f("optional_import_message"),
        newBuilderForField(message, f("optional_import_message"))
               .setField(importD, 120).build());

      message.setField(f("optional_nested_enum" ),  nestedBaz);
      message.setField(f("optional_foreign_enum"), foreignBaz);
      message.setField(f("optional_import_enum" ),  importBaz);

      message.setField(f("optional_string_piece" ), "124");
      message.setField(f("optional_cord" ), "125");

      // -----------------------------------------------------------------

      message.addRepeatedField(f("repeated_int32"   ), 201 );
      message.addRepeatedField(f("repeated_int64"   ), 202L);
      message.addRepeatedField(f("repeated_uint32"  ), 203 );
      message.addRepeatedField(f("repeated_uint64"  ), 204L);
      message.addRepeatedField(f("repeated_sint32"  ), 205 );
      message.addRepeatedField(f("repeated_sint64"  ), 206L);
      message.addRepeatedField(f("repeated_fixed32" ), 207 );
      message.addRepeatedField(f("repeated_fixed64" ), 208L);
      message.addRepeatedField(f("repeated_sfixed32"), 209 );
      message.addRepeatedField(f("repeated_sfixed64"), 210L);
      message.addRepeatedField(f("repeated_float"   ), 211F);
      message.addRepeatedField(f("repeated_double"  ), 212D);
      message.addRepeatedField(f("repeated_bool"    ), true);
      message.addRepeatedField(f("repeated_string"  ), "215");
      message.addRepeatedField(f("repeated_bytes"   ), toBytes("216"));

      message.addRepeatedField(f("repeatedgroup"),
        newBuilderForField(message, f("repeatedgroup"))
               .setField(repeatedGroupA, 217).build());
      message.addRepeatedField(f("repeated_nested_message"),
        newBuilderForField(message, f("repeated_nested_message"))
               .setField(nestedB, 218).build());
      message.addRepeatedField(f("repeated_foreign_message"),
        newBuilderForField(message, f("repeated_foreign_message"))
               .setField(foreignC, 219).build());
      message.addRepeatedField(f("repeated_import_message"),
        newBuilderForField(message, f("repeated_import_message"))
               .setField(importD, 220).build());

      message.addRepeatedField(f("repeated_nested_enum" ),  nestedBar);
      message.addRepeatedField(f("repeated_foreign_enum"), foreignBar);
      message.addRepeatedField(f("repeated_import_enum" ),  importBar);

      message.addRepeatedField(f("repeated_string_piece" ), "224");
      message.addRepeatedField(f("repeated_cord" ), "225");

      // Add a second one of each field.
      message.addRepeatedField(f("repeated_int32"   ), 301 );
      message.addRepeatedField(f("repeated_int64"   ), 302L);
      message.addRepeatedField(f("repeated_uint32"  ), 303 );
      message.addRepeatedField(f("repeated_uint64"  ), 304L);
      message.addRepeatedField(f("repeated_sint32"  ), 305 );
      message.addRepeatedField(f("repeated_sint64"  ), 306L);
      message.addRepeatedField(f("repeated_fixed32" ), 307 );
      message.addRepeatedField(f("repeated_fixed64" ), 308L);
      message.addRepeatedField(f("repeated_sfixed32"), 309 );
      message.addRepeatedField(f("repeated_sfixed64"), 310L);
      message.addRepeatedField(f("repeated_float"   ), 311F);
      message.addRepeatedField(f("repeated_double"  ), 312D);
      message.addRepeatedField(f("repeated_bool"    ), false);
      message.addRepeatedField(f("repeated_string"  ), "315");
      message.addRepeatedField(f("repeated_bytes"   ), toBytes("316"));

      message.addRepeatedField(f("repeatedgroup"),
        newBuilderForField(message, f("repeatedgroup"))
               .setField(repeatedGroupA, 317).build());
      message.addRepeatedField(f("repeated_nested_message"),
        newBuilderForField(message, f("repeated_nested_message"))
               .setField(nestedB, 318).build());
      message.addRepeatedField(f("repeated_foreign_message"),
        newBuilderForField(message, f("repeated_foreign_message"))
               .setField(foreignC, 319).build());
      message.addRepeatedField(f("repeated_import_message"),
        newBuilderForField(message, f("repeated_import_message"))
               .setField(importD, 320).build());

      message.addRepeatedField(f("repeated_nested_enum" ),  nestedBaz);
      message.addRepeatedField(f("repeated_foreign_enum"), foreignBaz);
      message.addRepeatedField(f("repeated_import_enum" ),  importBaz);

      message.addRepeatedField(f("repeated_string_piece" ), "324");
      message.addRepeatedField(f("repeated_cord" ), "325");

      // -----------------------------------------------------------------

      message.setField(f("default_int32"   ), 401 );
      message.setField(f("default_int64"   ), 402L);
      message.setField(f("default_uint32"  ), 403 );
      message.setField(f("default_uint64"  ), 404L);
      message.setField(f("default_sint32"  ), 405 );
      message.setField(f("default_sint64"  ), 406L);
      message.setField(f("default_fixed32" ), 407 );
      message.setField(f("default_fixed64" ), 408L);
      message.setField(f("default_sfixed32"), 409 );
      message.setField(f("default_sfixed64"), 410L);
      message.setField(f("default_float"   ), 411F);
      message.setField(f("default_double"  ), 412D);
      message.setField(f("default_bool"    ), false);
      message.setField(f("default_string"  ), "415");
      message.setField(f("default_bytes"   ), toBytes("416"));

      message.setField(f("default_nested_enum" ),  nestedFoo);
      message.setField(f("default_foreign_enum"), foreignFoo);
      message.setField(f("default_import_enum" ),  importFoo);

      message.setField(f("default_string_piece" ), "424");
      message.setField(f("default_cord" ), "425");
    }

    // -------------------------------------------------------------------

    /**
     * Modify the repeated fields of {@code message} to contain the values
     * expected by {@code assertRepeatedFieldsModified()}, using the
     * {@link Message.Builder} reflection interface.
     */
    void modifyRepeatedFieldsViaReflection(Message.Builder message) {
      message.setRepeatedField(f("repeated_int32"   ), 1, 501 );
      message.setRepeatedField(f("repeated_int64"   ), 1, 502L);
      message.setRepeatedField(f("repeated_uint32"  ), 1, 503 );
      message.setRepeatedField(f("repeated_uint64"  ), 1, 504L);
      message.setRepeatedField(f("repeated_sint32"  ), 1, 505 );
      message.setRepeatedField(f("repeated_sint64"  ), 1, 506L);
      message.setRepeatedField(f("repeated_fixed32" ), 1, 507 );
      message.setRepeatedField(f("repeated_fixed64" ), 1, 508L);
      message.setRepeatedField(f("repeated_sfixed32"), 1, 509 );
      message.setRepeatedField(f("repeated_sfixed64"), 1, 510L);
      message.setRepeatedField(f("repeated_float"   ), 1, 511F);
      message.setRepeatedField(f("repeated_double"  ), 1, 512D);
      message.setRepeatedField(f("repeated_bool"    ), 1, true);
      message.setRepeatedField(f("repeated_string"  ), 1, "515");
      message.setRepeatedField(f("repeated_bytes"   ), 1, toBytes("516"));

      message.setRepeatedField(f("repeatedgroup"), 1,
        newBuilderForField(message, f("repeatedgroup"))
               .setField(repeatedGroupA, 517).build());
      message.setRepeatedField(f("repeated_nested_message"), 1,
        newBuilderForField(message, f("repeated_nested_message"))
               .setField(nestedB, 518).build());
      message.setRepeatedField(f("repeated_foreign_message"), 1,
        newBuilderForField(message, f("repeated_foreign_message"))
               .setField(foreignC, 519).build());
      message.setRepeatedField(f("repeated_import_message"), 1,
        newBuilderForField(message, f("repeated_import_message"))
               .setField(importD, 520).build());

      message.setRepeatedField(f("repeated_nested_enum" ), 1,  nestedFoo);
      message.setRepeatedField(f("repeated_foreign_enum"), 1, foreignFoo);
      message.setRepeatedField(f("repeated_import_enum" ), 1,  importFoo);

      message.setRepeatedField(f("repeated_string_piece"), 1, "524");
      message.setRepeatedField(f("repeated_cord"), 1, "525");
    }

    // -------------------------------------------------------------------

    /**
     * Assert (using {@code junit.framework.Assert}} that all fields of
     * {@code message} are set to the values assigned by {@code setAllFields},
     * using the {@link Message} reflection interface.
     */
    public void assertAllFieldsSetViaReflection(Message message) {
      Assert.assertTrue(message.hasField(f("optional_int32"   )));
      Assert.assertTrue(message.hasField(f("optional_int64"   )));
      Assert.assertTrue(message.hasField(f("optional_uint32"  )));
      Assert.assertTrue(message.hasField(f("optional_uint64"  )));
      Assert.assertTrue(message.hasField(f("optional_sint32"  )));
      Assert.assertTrue(message.hasField(f("optional_sint64"  )));
      Assert.assertTrue(message.hasField(f("optional_fixed32" )));
      Assert.assertTrue(message.hasField(f("optional_fixed64" )));
      Assert.assertTrue(message.hasField(f("optional_sfixed32")));
      Assert.assertTrue(message.hasField(f("optional_sfixed64")));
      Assert.assertTrue(message.hasField(f("optional_float"   )));
      Assert.assertTrue(message.hasField(f("optional_double"  )));
      Assert.assertTrue(message.hasField(f("optional_bool"    )));
      Assert.assertTrue(message.hasField(f("optional_string"  )));
      Assert.assertTrue(message.hasField(f("optional_bytes"   )));

      Assert.assertTrue(message.hasField(f("optionalgroup"           )));
      Assert.assertTrue(message.hasField(f("optional_nested_message" )));
      Assert.assertTrue(message.hasField(f("optional_foreign_message")));
      Assert.assertTrue(message.hasField(f("optional_import_message" )));

      Assert.assertTrue(
        ((Message)message.getField(f("optionalgroup"))).hasField(groupA));
      Assert.assertTrue(
        ((Message)message.getField(f("optional_nested_message")))
                         .hasField(nestedB));
      Assert.assertTrue(
        ((Message)message.getField(f("optional_foreign_message")))
                         .hasField(foreignC));
      Assert.assertTrue(
        ((Message)message.getField(f("optional_import_message")))
                         .hasField(importD));

      Assert.assertTrue(message.hasField(f("optional_nested_enum" )));
      Assert.assertTrue(message.hasField(f("optional_foreign_enum")));
      Assert.assertTrue(message.hasField(f("optional_import_enum" )));

      Assert.assertTrue(message.hasField(f("optional_string_piece")));
      Assert.assertTrue(message.hasField(f("optional_cord")));

      Assert.assertEquals(101  , message.getField(f("optional_int32"   )));
      Assert.assertEquals(102L , message.getField(f("optional_int64"   )));
      Assert.assertEquals(103  , message.getField(f("optional_uint32"  )));
      Assert.assertEquals(104L , message.getField(f("optional_uint64"  )));
      Assert.assertEquals(105  , message.getField(f("optional_sint32"  )));
      Assert.assertEquals(106L , message.getField(f("optional_sint64"  )));
      Assert.assertEquals(107  , message.getField(f("optional_fixed32" )));
      Assert.assertEquals(108L , message.getField(f("optional_fixed64" )));
      Assert.assertEquals(109  , message.getField(f("optional_sfixed32")));
      Assert.assertEquals(110L , message.getField(f("optional_sfixed64")));
      Assert.assertEquals(111F , message.getField(f("optional_float"   )));
      Assert.assertEquals(112D , message.getField(f("optional_double"  )));
      Assert.assertEquals(true , message.getField(f("optional_bool"    )));
      Assert.assertEquals("115", message.getField(f("optional_string"  )));
      Assert.assertEquals(toBytes("116"), message.getField(f("optional_bytes")));

      Assert.assertEquals(117,
        ((Message)message.getField(f("optionalgroup"))).getField(groupA));
      Assert.assertEquals(118,
        ((Message)message.getField(f("optional_nested_message")))
                         .getField(nestedB));
      Assert.assertEquals(119,
        ((Message)message.getField(f("optional_foreign_message")))
                         .getField(foreignC));
      Assert.assertEquals(120,
        ((Message)message.getField(f("optional_import_message")))
                         .getField(importD));

      Assert.assertEquals( nestedBaz, message.getField(f("optional_nested_enum" )));
      Assert.assertEquals(foreignBaz, message.getField(f("optional_foreign_enum")));
      Assert.assertEquals( importBaz, message.getField(f("optional_import_enum" )));

      Assert.assertEquals("124", message.getField(f("optional_string_piece")));
      Assert.assertEquals("125", message.getField(f("optional_cord")));

      // -----------------------------------------------------------------

      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_int32"   )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_int64"   )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_uint32"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_uint64"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_sint32"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_sint64"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_fixed32" )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_fixed64" )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_sfixed32")));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_sfixed64")));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_float"   )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_double"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_bool"    )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_string"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_bytes"   )));

      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeatedgroup"           )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_nested_message" )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_foreign_message")));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_import_message" )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_nested_enum"    )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_foreign_enum"   )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_import_enum"    )));

      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_string_piece")));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_cord")));

      Assert.assertEquals(201  , message.getRepeatedField(f("repeated_int32"   ), 0));
      Assert.assertEquals(202L , message.getRepeatedField(f("repeated_int64"   ), 0));
      Assert.assertEquals(203  , message.getRepeatedField(f("repeated_uint32"  ), 0));
      Assert.assertEquals(204L , message.getRepeatedField(f("repeated_uint64"  ), 0));
      Assert.assertEquals(205  , message.getRepeatedField(f("repeated_sint32"  ), 0));
      Assert.assertEquals(206L , message.getRepeatedField(f("repeated_sint64"  ), 0));
      Assert.assertEquals(207  , message.getRepeatedField(f("repeated_fixed32" ), 0));
      Assert.assertEquals(208L , message.getRepeatedField(f("repeated_fixed64" ), 0));
      Assert.assertEquals(209  , message.getRepeatedField(f("repeated_sfixed32"), 0));
      Assert.assertEquals(210L , message.getRepeatedField(f("repeated_sfixed64"), 0));
      Assert.assertEquals(211F , message.getRepeatedField(f("repeated_float"   ), 0));
      Assert.assertEquals(212D , message.getRepeatedField(f("repeated_double"  ), 0));
      Assert.assertEquals(true , message.getRepeatedField(f("repeated_bool"    ), 0));
      Assert.assertEquals("215", message.getRepeatedField(f("repeated_string"  ), 0));
      Assert.assertEquals(toBytes("216"), message.getRepeatedField(f("repeated_bytes"), 0));

      Assert.assertEquals(217,
        ((Message)message.getRepeatedField(f("repeatedgroup"), 0))
                         .getField(repeatedGroupA));
      Assert.assertEquals(218,
        ((Message)message.getRepeatedField(f("repeated_nested_message"), 0))
                         .getField(nestedB));
      Assert.assertEquals(219,
        ((Message)message.getRepeatedField(f("repeated_foreign_message"), 0))
                         .getField(foreignC));
      Assert.assertEquals(220,
        ((Message)message.getRepeatedField(f("repeated_import_message"), 0))
                         .getField(importD));

      Assert.assertEquals( nestedBar, message.getRepeatedField(f("repeated_nested_enum" ),0));
      Assert.assertEquals(foreignBar, message.getRepeatedField(f("repeated_foreign_enum"),0));
      Assert.assertEquals( importBar, message.getRepeatedField(f("repeated_import_enum" ),0));

      Assert.assertEquals("224", message.getRepeatedField(f("repeated_string_piece"), 0));
      Assert.assertEquals("225", message.getRepeatedField(f("repeated_cord"), 0));

      Assert.assertEquals(301  , message.getRepeatedField(f("repeated_int32"   ), 1));
      Assert.assertEquals(302L , message.getRepeatedField(f("repeated_int64"   ), 1));
      Assert.assertEquals(303  , message.getRepeatedField(f("repeated_uint32"  ), 1));
      Assert.assertEquals(304L , message.getRepeatedField(f("repeated_uint64"  ), 1));
      Assert.assertEquals(305  , message.getRepeatedField(f("repeated_sint32"  ), 1));
      Assert.assertEquals(306L , message.getRepeatedField(f("repeated_sint64"  ), 1));
      Assert.assertEquals(307  , message.getRepeatedField(f("repeated_fixed32" ), 1));
      Assert.assertEquals(308L , message.getRepeatedField(f("repeated_fixed64" ), 1));
      Assert.assertEquals(309  , message.getRepeatedField(f("repeated_sfixed32"), 1));
      Assert.assertEquals(310L , message.getRepeatedField(f("repeated_sfixed64"), 1));
      Assert.assertEquals(311F , message.getRepeatedField(f("repeated_float"   ), 1));
      Assert.assertEquals(312D , message.getRepeatedField(f("repeated_double"  ), 1));
      Assert.assertEquals(false, message.getRepeatedField(f("repeated_bool"    ), 1));
      Assert.assertEquals("315", message.getRepeatedField(f("repeated_string"  ), 1));
      Assert.assertEquals(toBytes("316"), message.getRepeatedField(f("repeated_bytes"), 1));

      Assert.assertEquals(317,
        ((Message)message.getRepeatedField(f("repeatedgroup"), 1))
                         .getField(repeatedGroupA));
      Assert.assertEquals(318,
        ((Message)message.getRepeatedField(f("repeated_nested_message"), 1))
                         .getField(nestedB));
      Assert.assertEquals(319,
        ((Message)message.getRepeatedField(f("repeated_foreign_message"), 1))
                         .getField(foreignC));
      Assert.assertEquals(320,
        ((Message)message.getRepeatedField(f("repeated_import_message"), 1))
                         .getField(importD));

      Assert.assertEquals( nestedBaz, message.getRepeatedField(f("repeated_nested_enum" ),1));
      Assert.assertEquals(foreignBaz, message.getRepeatedField(f("repeated_foreign_enum"),1));
      Assert.assertEquals( importBaz, message.getRepeatedField(f("repeated_import_enum" ),1));

      Assert.assertEquals("324", message.getRepeatedField(f("repeated_string_piece"), 1));
      Assert.assertEquals("325", message.getRepeatedField(f("repeated_cord"), 1));

      // -----------------------------------------------------------------

      Assert.assertTrue(message.hasField(f("default_int32"   )));
      Assert.assertTrue(message.hasField(f("default_int64"   )));
      Assert.assertTrue(message.hasField(f("default_uint32"  )));
      Assert.assertTrue(message.hasField(f("default_uint64"  )));
      Assert.assertTrue(message.hasField(f("default_sint32"  )));
      Assert.assertTrue(message.hasField(f("default_sint64"  )));
      Assert.assertTrue(message.hasField(f("default_fixed32" )));
      Assert.assertTrue(message.hasField(f("default_fixed64" )));
      Assert.assertTrue(message.hasField(f("default_sfixed32")));
      Assert.assertTrue(message.hasField(f("default_sfixed64")));
      Assert.assertTrue(message.hasField(f("default_float"   )));
      Assert.assertTrue(message.hasField(f("default_double"  )));
      Assert.assertTrue(message.hasField(f("default_bool"    )));
      Assert.assertTrue(message.hasField(f("default_string"  )));
      Assert.assertTrue(message.hasField(f("default_bytes"   )));

      Assert.assertTrue(message.hasField(f("default_nested_enum" )));
      Assert.assertTrue(message.hasField(f("default_foreign_enum")));
      Assert.assertTrue(message.hasField(f("default_import_enum" )));

      Assert.assertTrue(message.hasField(f("default_string_piece")));
      Assert.assertTrue(message.hasField(f("default_cord")));

      Assert.assertEquals(401  , message.getField(f("default_int32"   )));
      Assert.assertEquals(402L , message.getField(f("default_int64"   )));
      Assert.assertEquals(403  , message.getField(f("default_uint32"  )));
      Assert.assertEquals(404L , message.getField(f("default_uint64"  )));
      Assert.assertEquals(405  , message.getField(f("default_sint32"  )));
      Assert.assertEquals(406L , message.getField(f("default_sint64"  )));
      Assert.assertEquals(407  , message.getField(f("default_fixed32" )));
      Assert.assertEquals(408L , message.getField(f("default_fixed64" )));
      Assert.assertEquals(409  , message.getField(f("default_sfixed32")));
      Assert.assertEquals(410L , message.getField(f("default_sfixed64")));
      Assert.assertEquals(411F , message.getField(f("default_float"   )));
      Assert.assertEquals(412D , message.getField(f("default_double"  )));
      Assert.assertEquals(false, message.getField(f("default_bool"    )));
      Assert.assertEquals("415", message.getField(f("default_string"  )));
      Assert.assertEquals(toBytes("416"), message.getField(f("default_bytes")));

      Assert.assertEquals( nestedFoo, message.getField(f("default_nested_enum" )));
      Assert.assertEquals(foreignFoo, message.getField(f("default_foreign_enum")));
      Assert.assertEquals( importFoo, message.getField(f("default_import_enum" )));

      Assert.assertEquals("424", message.getField(f("default_string_piece")));
      Assert.assertEquals("425", message.getField(f("default_cord")));
    }

    // -------------------------------------------------------------------

    /**
     * Assert (using {@code junit.framework.Assert}} that all fields of
     * {@code message} are cleared, and that getting the fields returns their
     * default values, using the {@link Message} reflection interface.
     */
    public void assertClearViaReflection(Message message) {
      // has_blah() should initially be false for all optional fields.
      Assert.assertFalse(message.hasField(f("optional_int32"   )));
      Assert.assertFalse(message.hasField(f("optional_int64"   )));
      Assert.assertFalse(message.hasField(f("optional_uint32"  )));
      Assert.assertFalse(message.hasField(f("optional_uint64"  )));
      Assert.assertFalse(message.hasField(f("optional_sint32"  )));
      Assert.assertFalse(message.hasField(f("optional_sint64"  )));
      Assert.assertFalse(message.hasField(f("optional_fixed32" )));
      Assert.assertFalse(message.hasField(f("optional_fixed64" )));
      Assert.assertFalse(message.hasField(f("optional_sfixed32")));
      Assert.assertFalse(message.hasField(f("optional_sfixed64")));
      Assert.assertFalse(message.hasField(f("optional_float"   )));
      Assert.assertFalse(message.hasField(f("optional_double"  )));
      Assert.assertFalse(message.hasField(f("optional_bool"    )));
      Assert.assertFalse(message.hasField(f("optional_string"  )));
      Assert.assertFalse(message.hasField(f("optional_bytes"   )));

      Assert.assertFalse(message.hasField(f("optionalgroup"           )));
      Assert.assertFalse(message.hasField(f("optional_nested_message" )));
      Assert.assertFalse(message.hasField(f("optional_foreign_message")));
      Assert.assertFalse(message.hasField(f("optional_import_message" )));

      Assert.assertFalse(message.hasField(f("optional_nested_enum" )));
      Assert.assertFalse(message.hasField(f("optional_foreign_enum")));
      Assert.assertFalse(message.hasField(f("optional_import_enum" )));

      Assert.assertFalse(message.hasField(f("optional_string_piece")));
      Assert.assertFalse(message.hasField(f("optional_cord")));

      // Optional fields without defaults are set to zero or something like it.
      Assert.assertEquals(0    , message.getField(f("optional_int32"   )));
      Assert.assertEquals(0L   , message.getField(f("optional_int64"   )));
      Assert.assertEquals(0    , message.getField(f("optional_uint32"  )));
      Assert.assertEquals(0L   , message.getField(f("optional_uint64"  )));
      Assert.assertEquals(0    , message.getField(f("optional_sint32"  )));
      Assert.assertEquals(0L   , message.getField(f("optional_sint64"  )));
      Assert.assertEquals(0    , message.getField(f("optional_fixed32" )));
      Assert.assertEquals(0L   , message.getField(f("optional_fixed64" )));
      Assert.assertEquals(0    , message.getField(f("optional_sfixed32")));
      Assert.assertEquals(0L   , message.getField(f("optional_sfixed64")));
      Assert.assertEquals(0F   , message.getField(f("optional_float"   )));
      Assert.assertEquals(0D   , message.getField(f("optional_double"  )));
      Assert.assertEquals(false, message.getField(f("optional_bool"    )));
      Assert.assertEquals(""   , message.getField(f("optional_string"  )));
      Assert.assertEquals(ByteString.EMPTY, message.getField(f("optional_bytes")));

      // Embedded messages should also be clear.
      Assert.assertFalse(
        ((Message)message.getField(f("optionalgroup"))).hasField(groupA));
      Assert.assertFalse(
        ((Message)message.getField(f("optional_nested_message")))
                         .hasField(nestedB));
      Assert.assertFalse(
        ((Message)message.getField(f("optional_foreign_message")))
                         .hasField(foreignC));
      Assert.assertFalse(
        ((Message)message.getField(f("optional_import_message")))
                         .hasField(importD));

      Assert.assertEquals(0,
        ((Message)message.getField(f("optionalgroup"))).getField(groupA));
      Assert.assertEquals(0,
        ((Message)message.getField(f("optional_nested_message")))
                         .getField(nestedB));
      Assert.assertEquals(0,
        ((Message)message.getField(f("optional_foreign_message")))
                         .getField(foreignC));
      Assert.assertEquals(0,
        ((Message)message.getField(f("optional_import_message")))
                         .getField(importD));

      // Enums without defaults are set to the first value in the enum.
      Assert.assertEquals( nestedFoo, message.getField(f("optional_nested_enum" )));
      Assert.assertEquals(foreignFoo, message.getField(f("optional_foreign_enum")));
      Assert.assertEquals( importFoo, message.getField(f("optional_import_enum" )));

      Assert.assertEquals("", message.getField(f("optional_string_piece")));
      Assert.assertEquals("", message.getField(f("optional_cord")));

      // Repeated fields are empty.
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_int32"   )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_int64"   )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_uint32"  )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_uint64"  )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_sint32"  )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_sint64"  )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_fixed32" )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_fixed64" )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_sfixed32")));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_sfixed64")));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_float"   )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_double"  )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_bool"    )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_string"  )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_bytes"   )));

      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeatedgroup"           )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_nested_message" )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_foreign_message")));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_import_message" )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_nested_enum"    )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_foreign_enum"   )));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_import_enum"    )));

      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_string_piece")));
      Assert.assertEquals(0, message.getRepeatedFieldCount(f("repeated_cord")));

      // has_blah() should also be false for all default fields.
      Assert.assertFalse(message.hasField(f("default_int32"   )));
      Assert.assertFalse(message.hasField(f("default_int64"   )));
      Assert.assertFalse(message.hasField(f("default_uint32"  )));
      Assert.assertFalse(message.hasField(f("default_uint64"  )));
      Assert.assertFalse(message.hasField(f("default_sint32"  )));
      Assert.assertFalse(message.hasField(f("default_sint64"  )));
      Assert.assertFalse(message.hasField(f("default_fixed32" )));
      Assert.assertFalse(message.hasField(f("default_fixed64" )));
      Assert.assertFalse(message.hasField(f("default_sfixed32")));
      Assert.assertFalse(message.hasField(f("default_sfixed64")));
      Assert.assertFalse(message.hasField(f("default_float"   )));
      Assert.assertFalse(message.hasField(f("default_double"  )));
      Assert.assertFalse(message.hasField(f("default_bool"    )));
      Assert.assertFalse(message.hasField(f("default_string"  )));
      Assert.assertFalse(message.hasField(f("default_bytes"   )));

      Assert.assertFalse(message.hasField(f("default_nested_enum" )));
      Assert.assertFalse(message.hasField(f("default_foreign_enum")));
      Assert.assertFalse(message.hasField(f("default_import_enum" )));

      Assert.assertFalse(message.hasField(f("default_string_piece" )));
      Assert.assertFalse(message.hasField(f("default_cord" )));

      // Fields with defaults have their default values (duh).
      Assert.assertEquals( 41    , message.getField(f("default_int32"   )));
      Assert.assertEquals( 42L   , message.getField(f("default_int64"   )));
      Assert.assertEquals( 43    , message.getField(f("default_uint32"  )));
      Assert.assertEquals( 44L   , message.getField(f("default_uint64"  )));
      Assert.assertEquals(-45    , message.getField(f("default_sint32"  )));
      Assert.assertEquals( 46L   , message.getField(f("default_sint64"  )));
      Assert.assertEquals( 47    , message.getField(f("default_fixed32" )));
      Assert.assertEquals( 48L   , message.getField(f("default_fixed64" )));
      Assert.assertEquals( 49    , message.getField(f("default_sfixed32")));
      Assert.assertEquals(-50L   , message.getField(f("default_sfixed64")));
      Assert.assertEquals( 51.5F , message.getField(f("default_float"   )));
      Assert.assertEquals( 52e3D , message.getField(f("default_double"  )));
      Assert.assertEquals(true   , message.getField(f("default_bool"    )));
      Assert.assertEquals("hello", message.getField(f("default_string"  )));
      Assert.assertEquals(toBytes("world"), message.getField(f("default_bytes")));

      Assert.assertEquals( nestedBar, message.getField(f("default_nested_enum" )));
      Assert.assertEquals(foreignBar, message.getField(f("default_foreign_enum")));
      Assert.assertEquals( importBar, message.getField(f("default_import_enum" )));

      Assert.assertEquals("abc", message.getField(f("default_string_piece")));
      Assert.assertEquals("123", message.getField(f("default_cord")));
    }

    // ---------------------------------------------------------------

    public void assertRepeatedFieldsModifiedViaReflection(Message message) {
      // ModifyRepeatedFields only sets the second repeated element of each
      // field.  In addition to verifying this, we also verify that the first
      // element and size were *not* modified.
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_int32"   )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_int64"   )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_uint32"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_uint64"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_sint32"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_sint64"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_fixed32" )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_fixed64" )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_sfixed32")));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_sfixed64")));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_float"   )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_double"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_bool"    )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_string"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_bytes"   )));

      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeatedgroup"           )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_nested_message" )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_foreign_message")));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_import_message" )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_nested_enum"    )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_foreign_enum"   )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_import_enum"    )));

      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_string_piece")));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("repeated_cord")));

      Assert.assertEquals(201  , message.getRepeatedField(f("repeated_int32"   ), 0));
      Assert.assertEquals(202L , message.getRepeatedField(f("repeated_int64"   ), 0));
      Assert.assertEquals(203  , message.getRepeatedField(f("repeated_uint32"  ), 0));
      Assert.assertEquals(204L , message.getRepeatedField(f("repeated_uint64"  ), 0));
      Assert.assertEquals(205  , message.getRepeatedField(f("repeated_sint32"  ), 0));
      Assert.assertEquals(206L , message.getRepeatedField(f("repeated_sint64"  ), 0));
      Assert.assertEquals(207  , message.getRepeatedField(f("repeated_fixed32" ), 0));
      Assert.assertEquals(208L , message.getRepeatedField(f("repeated_fixed64" ), 0));
      Assert.assertEquals(209  , message.getRepeatedField(f("repeated_sfixed32"), 0));
      Assert.assertEquals(210L , message.getRepeatedField(f("repeated_sfixed64"), 0));
      Assert.assertEquals(211F , message.getRepeatedField(f("repeated_float"   ), 0));
      Assert.assertEquals(212D , message.getRepeatedField(f("repeated_double"  ), 0));
      Assert.assertEquals(true , message.getRepeatedField(f("repeated_bool"    ), 0));
      Assert.assertEquals("215", message.getRepeatedField(f("repeated_string"  ), 0));
      Assert.assertEquals(toBytes("216"), message.getRepeatedField(f("repeated_bytes"), 0));

      Assert.assertEquals(217,
        ((Message)message.getRepeatedField(f("repeatedgroup"), 0))
                         .getField(repeatedGroupA));
      Assert.assertEquals(218,
        ((Message)message.getRepeatedField(f("repeated_nested_message"), 0))
                         .getField(nestedB));
      Assert.assertEquals(219,
        ((Message)message.getRepeatedField(f("repeated_foreign_message"), 0))
                         .getField(foreignC));
      Assert.assertEquals(220,
        ((Message)message.getRepeatedField(f("repeated_import_message"), 0))
                         .getField(importD));

      Assert.assertEquals( nestedBar, message.getRepeatedField(f("repeated_nested_enum" ),0));
      Assert.assertEquals(foreignBar, message.getRepeatedField(f("repeated_foreign_enum"),0));
      Assert.assertEquals( importBar, message.getRepeatedField(f("repeated_import_enum" ),0));

      Assert.assertEquals("224", message.getRepeatedField(f("repeated_string_piece"), 0));
      Assert.assertEquals("225", message.getRepeatedField(f("repeated_cord"), 0));

      Assert.assertEquals(501  , message.getRepeatedField(f("repeated_int32"   ), 1));
      Assert.assertEquals(502L , message.getRepeatedField(f("repeated_int64"   ), 1));
      Assert.assertEquals(503  , message.getRepeatedField(f("repeated_uint32"  ), 1));
      Assert.assertEquals(504L , message.getRepeatedField(f("repeated_uint64"  ), 1));
      Assert.assertEquals(505  , message.getRepeatedField(f("repeated_sint32"  ), 1));
      Assert.assertEquals(506L , message.getRepeatedField(f("repeated_sint64"  ), 1));
      Assert.assertEquals(507  , message.getRepeatedField(f("repeated_fixed32" ), 1));
      Assert.assertEquals(508L , message.getRepeatedField(f("repeated_fixed64" ), 1));
      Assert.assertEquals(509  , message.getRepeatedField(f("repeated_sfixed32"), 1));
      Assert.assertEquals(510L , message.getRepeatedField(f("repeated_sfixed64"), 1));
      Assert.assertEquals(511F , message.getRepeatedField(f("repeated_float"   ), 1));
      Assert.assertEquals(512D , message.getRepeatedField(f("repeated_double"  ), 1));
      Assert.assertEquals(true , message.getRepeatedField(f("repeated_bool"    ), 1));
      Assert.assertEquals("515", message.getRepeatedField(f("repeated_string"  ), 1));
      Assert.assertEquals(toBytes("516"), message.getRepeatedField(f("repeated_bytes"), 1));

      Assert.assertEquals(517,
        ((Message)message.getRepeatedField(f("repeatedgroup"), 1))
                         .getField(repeatedGroupA));
      Assert.assertEquals(518,
        ((Message)message.getRepeatedField(f("repeated_nested_message"), 1))
                         .getField(nestedB));
      Assert.assertEquals(519,
        ((Message)message.getRepeatedField(f("repeated_foreign_message"), 1))
                         .getField(foreignC));
      Assert.assertEquals(520,
        ((Message)message.getRepeatedField(f("repeated_import_message"), 1))
                         .getField(importD));

      Assert.assertEquals( nestedFoo, message.getRepeatedField(f("repeated_nested_enum" ),1));
      Assert.assertEquals(foreignFoo, message.getRepeatedField(f("repeated_foreign_enum"),1));
      Assert.assertEquals( importFoo, message.getRepeatedField(f("repeated_import_enum" ),1));

      Assert.assertEquals("524", message.getRepeatedField(f("repeated_string_piece"), 1));
      Assert.assertEquals("525", message.getRepeatedField(f("repeated_cord"), 1));
    }

    public void setPackedFieldsViaReflection(Message.Builder message) {
      message.addRepeatedField(f("packed_int32"   ), 601 );
      message.addRepeatedField(f("packed_int64"   ), 602L);
      message.addRepeatedField(f("packed_uint32"  ), 603 );
      message.addRepeatedField(f("packed_uint64"  ), 604L);
      message.addRepeatedField(f("packed_sint32"  ), 605 );
      message.addRepeatedField(f("packed_sint64"  ), 606L);
      message.addRepeatedField(f("packed_fixed32" ), 607 );
      message.addRepeatedField(f("packed_fixed64" ), 608L);
      message.addRepeatedField(f("packed_sfixed32"), 609 );
      message.addRepeatedField(f("packed_sfixed64"), 610L);
      message.addRepeatedField(f("packed_float"   ), 611F);
      message.addRepeatedField(f("packed_double"  ), 612D);
      message.addRepeatedField(f("packed_bool"    ), true);
      message.addRepeatedField(f("packed_enum" ),  foreignBar);
      // Add a second one of each field.
      message.addRepeatedField(f("packed_int32"   ), 701 );
      message.addRepeatedField(f("packed_int64"   ), 702L);
      message.addRepeatedField(f("packed_uint32"  ), 703 );
      message.addRepeatedField(f("packed_uint64"  ), 704L);
      message.addRepeatedField(f("packed_sint32"  ), 705 );
      message.addRepeatedField(f("packed_sint64"  ), 706L);
      message.addRepeatedField(f("packed_fixed32" ), 707 );
      message.addRepeatedField(f("packed_fixed64" ), 708L);
      message.addRepeatedField(f("packed_sfixed32"), 709 );
      message.addRepeatedField(f("packed_sfixed64"), 710L);
      message.addRepeatedField(f("packed_float"   ), 711F);
      message.addRepeatedField(f("packed_double"  ), 712D);
      message.addRepeatedField(f("packed_bool"    ), false);
      message.addRepeatedField(f("packed_enum" ),  foreignBaz);
    }

    public void assertPackedFieldsSetViaReflection(Message message) {
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_int32"   )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_int64"   )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_uint32"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_uint64"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_sint32"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_sint64"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_fixed32" )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_fixed64" )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_sfixed32")));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_sfixed64")));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_float"   )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_double"  )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_bool"    )));
      Assert.assertEquals(2, message.getRepeatedFieldCount(f("packed_enum"   )));
      Assert.assertEquals(601  , message.getRepeatedField(f("packed_int32"   ), 0));
      Assert.assertEquals(602L , message.getRepeatedField(f("packed_int64"   ), 0));
      Assert.assertEquals(603  , message.getRepeatedField(f("packed_uint32"  ), 0));
      Assert.assertEquals(604L , message.getRepeatedField(f("packed_uint64"  ), 0));
      Assert.assertEquals(605  , message.getRepeatedField(f("packed_sint32"  ), 0));
      Assert.assertEquals(606L , message.getRepeatedField(f("packed_sint64"  ), 0));
      Assert.assertEquals(607  , message.getRepeatedField(f("packed_fixed32" ), 0));
      Assert.assertEquals(608L , message.getRepeatedField(f("packed_fixed64" ), 0));
      Assert.assertEquals(609  , message.getRepeatedField(f("packed_sfixed32"), 0));
      Assert.assertEquals(610L , message.getRepeatedField(f("packed_sfixed64"), 0));
      Assert.assertEquals(611F , message.getRepeatedField(f("packed_float"   ), 0));
      Assert.assertEquals(612D , message.getRepeatedField(f("packed_double"  ), 0));
      Assert.assertEquals(true , message.getRepeatedField(f("packed_bool"    ), 0));
      Assert.assertEquals(foreignBar, message.getRepeatedField(f("packed_enum" ),0));
      Assert.assertEquals(701  , message.getRepeatedField(f("packed_int32"   ), 1));
      Assert.assertEquals(702L , message.getRepeatedField(f("packed_int64"   ), 1));
      Assert.assertEquals(703  , message.getRepeatedField(f("packed_uint32"  ), 1));
      Assert.assertEquals(704L , message.getRepeatedField(f("packed_uint64"  ), 1));
      Assert.assertEquals(705  , message.getRepeatedField(f("packed_sint32"  ), 1));
      Assert.assertEquals(706L , message.getRepeatedField(f("packed_sint64"  ), 1));
      Assert.assertEquals(707  , message.getRepeatedField(f("packed_fixed32" ), 1));
      Assert.assertEquals(708L , message.getRepeatedField(f("packed_fixed64" ), 1));
      Assert.assertEquals(709  , message.getRepeatedField(f("packed_sfixed32"), 1));
      Assert.assertEquals(710L , message.getRepeatedField(f("packed_sfixed64"), 1));
      Assert.assertEquals(711F , message.getRepeatedField(f("packed_float"   ), 1));
      Assert.assertEquals(712D , message.getRepeatedField(f("packed_double"  ), 1));
      Assert.assertEquals(false, message.getRepeatedField(f("packed_bool"    ), 1));
      Assert.assertEquals(foreignBaz, message.getRepeatedField(f("packed_enum" ),1));
    }

    /**
     * Verifies that the reflection setters for the given.Builder object throw a
     * NullPointerException if they are passed a null value.  Uses Assert to throw an
     * appropriate assertion failure, if the condition is not verified.
     */
    public void assertReflectionSettersRejectNull(Message.Builder builder)
        throws Exception {
      try {
        builder.setField(f("optional_string"), null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }
      try {
        builder.setField(f("optional_bytes"), null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }
      try {
        builder.setField(f("optional_nested_enum"), null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }
      try {
        builder.setField(f("optional_nested_message"),
                         (TestAllTypes.NestedMessage) null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }
      try {
        builder.setField(f("optional_nested_message"),
                         (TestAllTypes.NestedMessage.Builder) null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }

      try {
        builder.addRepeatedField(f("repeated_string"), null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }
      try {
        builder.addRepeatedField(f("repeated_bytes"), null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }
      try {
        builder.addRepeatedField(f("repeated_nested_enum"), null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }
      try {
        builder.addRepeatedField(f("repeated_nested_message"), null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }
    }

    /**
     * Verifies that the reflection repeated setters for the given Builder object throw a
     * NullPointerException if they are passed a null value.  Uses Assert to throw an appropriate
     * assertion failure, if the condition is not verified.
     */
    public void assertReflectionRepeatedSettersRejectNull(Message.Builder builder)
        throws Exception {
      builder.addRepeatedField(f("repeated_string"), "one");
      try {
        builder.setRepeatedField(f("repeated_string"), 0, null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }

      builder.addRepeatedField(f("repeated_bytes"), toBytes("one"));
      try {
        builder.setRepeatedField(f("repeated_bytes"), 0, null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }

      builder.addRepeatedField(f("repeated_nested_enum"), nestedBaz);
      try {
        builder.setRepeatedField(f("repeated_nested_enum"), 0, null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }

      builder.addRepeatedField(
          f("repeated_nested_message"),
          TestAllTypes.NestedMessage.newBuilder().setBb(218).build());
      try {
        builder.setRepeatedField(f("repeated_nested_message"), 0, null);
        Assert.fail("Exception was not thrown");
      } catch (NullPointerException e) {
        // We expect this exception.
      }
    }
  }

  /**
   * @param filePath The path relative to
   * {@link com.google.testing.util.TestUtil#getDefaultSrcDir}.
   */
  public static String readTextFromFile(String filePath) {
    return readBytesFromFile(filePath).toStringUtf8();
  }

  private static File getTestDataDir() {
    // Search each parent directory looking for "src/google/protobuf".
    File ancestor = new File(".");
    try {
      ancestor = ancestor.getCanonicalFile();
    } catch (IOException e) {
      throw new RuntimeException(
        "Couldn't get canonical name of working directory.", e);
    }
    while (ancestor != null && ancestor.exists()) {
      if (new File(ancestor, "src/test/resources/proto").exists()) {
        return new File(ancestor, "src/test/resources");
      }
      ancestor = ancestor.getParentFile();
    }

    throw new RuntimeException(
      "Could not find golden files.  This test must be run from within the " +
      "protobuf source package so that it can read test data files from the " +
      "C++ source tree.");
  }

  /**
   * @param filePath The path relative to
   * {@link com.google.testing.util.TestUtil#getDefaultSrcDir}.
   */
  public static ByteString readBytesFromFile(String filename) {
    File fullPath = new File(getTestDataDir(), filename);
    try {
      RandomAccessFile file = new RandomAccessFile(fullPath, "r");
      byte[] content = new byte[(int) file.length()];
      file.readFully(content);
      return ByteString.copyFrom(content);
    } catch (IOException e) {
      // Throw a RuntimeException here so that we can call this function from
      // static initializers.
      throw new IllegalArgumentException(
        "Couldn't read file: " + fullPath.getPath(), e);
    }
  }

  /**
   * Get the bytes of the "golden message".  This is a serialized TestAllTypes
   * with all fields set as they would be by
   * {@link setAllFields(TestAllTypes.Builder)}, but it is loaded from a file
   * on disk rather than generated dynamically.  The file is actually generated
   * by C++ code, so testing against it verifies compatibility with C++.
   */
  public static ByteString getGoldenMessage() {
    if (goldenMessage == null) {
      goldenMessage = readBytesFromFile("golden_message");
    }
    return goldenMessage;
  }
  private static ByteString goldenMessage = null;

  /**
   * Get the bytes of the "golden packed fields message".  This is a serialized
   * TestPackedTypes with all fields set as they would be by
   * {@link setPackedFields(TestPackedTypes.Builder)}, but it is loaded from a
   * file on disk rather than generated dynamically.  The file is actually
   * generated by C++ code, so testing against it verifies compatibility with
   * C++.
   */
  public static ByteString getGoldenPackedFieldsMessage() {
    if (goldenPackedFieldsMessage == null) {
      goldenPackedFieldsMessage =
          readBytesFromFile("golden_packed_fields_message");
    }
    return goldenPackedFieldsMessage;
  }
  private static ByteString goldenPackedFieldsMessage = null;
}