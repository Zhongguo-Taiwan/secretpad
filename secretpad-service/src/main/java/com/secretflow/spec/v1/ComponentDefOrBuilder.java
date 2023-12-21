// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secretflow/spec/v1/component.proto

package com.secretflow.spec.v1;

public interface ComponentDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secretflow.spec.v1.ComponentDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Namespace of the comp.
   * </pre>
   *
   * <code>string domain = 1;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * Namespace of the comp.
   * </pre>
   *
   * <code>string domain = 1;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * Should be unique among all comps of the same domain.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Should be unique among all comps of the same domain.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string desc = 3;</code>
   * @return The desc.
   */
  java.lang.String getDesc();
  /**
   * <code>string desc = 3;</code>
   * @return The bytes for desc.
   */
  com.google.protobuf.ByteString
      getDescBytes();

  /**
   * <pre>
   * Version of the comp.
   * </pre>
   *
   * <code>string version = 4;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * Version of the comp.
   * </pre>
   *
   * <code>string version = 4;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>repeated .secretflow.spec.v1.AttributeDef attrs = 5;</code>
   */
  java.util.List<com.secretflow.spec.v1.AttributeDef> 
      getAttrsList();
  /**
   * <code>repeated .secretflow.spec.v1.AttributeDef attrs = 5;</code>
   */
  com.secretflow.spec.v1.AttributeDef getAttrs(int index);
  /**
   * <code>repeated .secretflow.spec.v1.AttributeDef attrs = 5;</code>
   */
  int getAttrsCount();
  /**
   * <code>repeated .secretflow.spec.v1.AttributeDef attrs = 5;</code>
   */
  java.util.List<? extends com.secretflow.spec.v1.AttributeDefOrBuilder> 
      getAttrsOrBuilderList();
  /**
   * <code>repeated .secretflow.spec.v1.AttributeDef attrs = 5;</code>
   */
  com.secretflow.spec.v1.AttributeDefOrBuilder getAttrsOrBuilder(
      int index);

  /**
   * <code>repeated .secretflow.spec.v1.IoDef inputs = 6;</code>
   */
  java.util.List<com.secretflow.spec.v1.IoDef> 
      getInputsList();
  /**
   * <code>repeated .secretflow.spec.v1.IoDef inputs = 6;</code>
   */
  com.secretflow.spec.v1.IoDef getInputs(int index);
  /**
   * <code>repeated .secretflow.spec.v1.IoDef inputs = 6;</code>
   */
  int getInputsCount();
  /**
   * <code>repeated .secretflow.spec.v1.IoDef inputs = 6;</code>
   */
  java.util.List<? extends com.secretflow.spec.v1.IoDefOrBuilder> 
      getInputsOrBuilderList();
  /**
   * <code>repeated .secretflow.spec.v1.IoDef inputs = 6;</code>
   */
  com.secretflow.spec.v1.IoDefOrBuilder getInputsOrBuilder(
      int index);

  /**
   * <code>repeated .secretflow.spec.v1.IoDef outputs = 7;</code>
   */
  java.util.List<com.secretflow.spec.v1.IoDef> 
      getOutputsList();
  /**
   * <code>repeated .secretflow.spec.v1.IoDef outputs = 7;</code>
   */
  com.secretflow.spec.v1.IoDef getOutputs(int index);
  /**
   * <code>repeated .secretflow.spec.v1.IoDef outputs = 7;</code>
   */
  int getOutputsCount();
  /**
   * <code>repeated .secretflow.spec.v1.IoDef outputs = 7;</code>
   */
  java.util.List<? extends com.secretflow.spec.v1.IoDefOrBuilder> 
      getOutputsOrBuilderList();
  /**
   * <code>repeated .secretflow.spec.v1.IoDef outputs = 7;</code>
   */
  com.secretflow.spec.v1.IoDefOrBuilder getOutputsOrBuilder(
      int index);
}