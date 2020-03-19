/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.serviceconsumermanagement.v1beta1.model;

/**
 * `Service` is the root object of Google service configuration schema. It describes basic
 * information about a service, such as the name and the title, and delegates other aspects to sub-
 * sections. Each sub-section is either a proto message or a repeated proto message that configures
 * a specific aspect, such as auth. See each proto message definition for details.
 *
 * Example:
 *
 *     type: google.api.Service     config_version: 3     name: calendar.googleapis.com     title:
 * Google Calendar API     apis:     - name: google.calendar.v3.Calendar     authentication:
 * providers:       - id: google_calendar_auth         jwks_uri:
 * https://www.googleapis.com/oauth2/v1/certs         issuer: https://securetoken.google.com
 * rules:       - selector: "*"         requirements:           provider_id: google_calendar_auth
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Consumer Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Service extends com.google.api.client.json.GenericJson {

  /**
   * A list of API interfaces exported by this service. Only the `name` field of the
   * google.protobuf.Api needs to be provided by the configuration author, as the remaining fields
   * will be derived from the IDL during the normalization process. It is an error to specify an API
   * interface here which cannot be resolved against the associated IDL files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Api> apis;

  static {
    // hack to force ProGuard to consider Api used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Api.class);
  }

  /**
   * Auth configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Authentication authentication;

  /**
   * API backend configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Backend backend;

  /**
   * Billing configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Billing billing;

  /**
   * The semantic version of the service configuration. The config version affects the
   * interpretation of the service configuration. For example, certain features are enabled by
   * default for certain config versions.
   *
   * The latest config version is `3`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long configVersion;

  /**
   * Context configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Context context;

  /**
   * Configuration for the service control plane.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Control control;

  /**
   * Custom error configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomError customError;

  /**
   * Additional API documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Documentation documentation;

  /**
   * Configuration for network endpoints.  If this is empty, then an endpoint with the same name as
   * the service is automatically generated to service all defined APIs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Endpoint> endpoints;

  static {
    // hack to force ProGuard to consider Endpoint used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Endpoint.class);
  }

  /**
   * A list of all enum types included in this API service.  Enums referenced directly or indirectly
   * by the `apis` are automatically included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *
   *     enums:     - name: google.someapi.v1.SomeEnum
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServiceConsumerManagementEnum> enums;

  static {
    // hack to force ProGuard to consider ServiceConsumerManagementEnum used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ServiceConsumerManagementEnum.class);
  }

  /**
   * HTTP configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Http http;

  /**
   * A unique ID for a specific instance of this message, typically assigned by the client for
   * tracking purpose. Must be no longer than 63 characters and only lower case letters, digits,
   * '.', '_' and '-' are allowed. If empty, the server may choose to generate one instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Logging configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Logging logging;

  /**
   * Defines the logs used by this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LogDescriptor> logs;

  static {
    // hack to force ProGuard to consider LogDescriptor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LogDescriptor.class);
  }

  /**
   * Defines the metrics used by this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricDescriptor> metrics;

  static {
    // hack to force ProGuard to consider MetricDescriptor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MetricDescriptor.class);
  }

  /**
   * Defines the monitored resources used by this service. This is required by the
   * Service.monitoring and Service.logging configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MonitoredResourceDescriptor> monitoredResources;

  static {
    // hack to force ProGuard to consider MonitoredResourceDescriptor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MonitoredResourceDescriptor.class);
  }

  /**
   * Monitoring configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Monitoring monitoring;

  /**
   * The service name, which is a DNS-like logical identifier for the service, such as
   * `calendar.googleapis.com`. The service name typically goes through DNS verification to make
   * sure the owner of the service also owns the DNS name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The Google project that owns this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String producerProjectId;

  /**
   * Quota configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Quota quota;

  /**
   * Output only. The source information for this configuration if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SourceInfo sourceInfo;

  /**
   * System parameter configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SystemParameters systemParameters;

  /**
   * A list of all proto message types included in this API service. It serves similar purpose as
   * [google.api.Service.types], except that these types are not needed by user-defined APIs.
   * Therefore, they will not show up in the generated discovery doc. This field should only be used
   * to define system APIs in ESF.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Type> systemTypes;

  /**
   * The product title for this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * A list of all proto message types included in this API service. Types referenced directly or
   * indirectly by the `apis` are automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type, should be listed here
   * by name. Example:
   *
   *     types:     - name: google.protobuf.Int32
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Type> types;

  /**
   * Configuration controlling usage of this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Usage usage;

  /**
   * A list of API interfaces exported by this service. Only the `name` field of the
   * google.protobuf.Api needs to be provided by the configuration author, as the remaining fields
   * will be derived from the IDL during the normalization process. It is an error to specify an API
   * interface here which cannot be resolved against the associated IDL files.
   * @return value or {@code null} for none
   */
  public java.util.List<Api> getApis() {
    return apis;
  }

  /**
   * A list of API interfaces exported by this service. Only the `name` field of the
   * google.protobuf.Api needs to be provided by the configuration author, as the remaining fields
   * will be derived from the IDL during the normalization process. It is an error to specify an API
   * interface here which cannot be resolved against the associated IDL files.
   * @param apis apis or {@code null} for none
   */
  public Service setApis(java.util.List<Api> apis) {
    this.apis = apis;
    return this;
  }

  /**
   * Auth configuration.
   * @return value or {@code null} for none
   */
  public Authentication getAuthentication() {
    return authentication;
  }

  /**
   * Auth configuration.
   * @param authentication authentication or {@code null} for none
   */
  public Service setAuthentication(Authentication authentication) {
    this.authentication = authentication;
    return this;
  }

  /**
   * API backend configuration.
   * @return value or {@code null} for none
   */
  public Backend getBackend() {
    return backend;
  }

  /**
   * API backend configuration.
   * @param backend backend or {@code null} for none
   */
  public Service setBackend(Backend backend) {
    this.backend = backend;
    return this;
  }

  /**
   * Billing configuration.
   * @return value or {@code null} for none
   */
  public Billing getBilling() {
    return billing;
  }

  /**
   * Billing configuration.
   * @param billing billing or {@code null} for none
   */
  public Service setBilling(Billing billing) {
    this.billing = billing;
    return this;
  }

  /**
   * The semantic version of the service configuration. The config version affects the
   * interpretation of the service configuration. For example, certain features are enabled by
   * default for certain config versions.
   *
   * The latest config version is `3`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getConfigVersion() {
    return configVersion;
  }

  /**
   * The semantic version of the service configuration. The config version affects the
   * interpretation of the service configuration. For example, certain features are enabled by
   * default for certain config versions.
   *
   * The latest config version is `3`.
   * @param configVersion configVersion or {@code null} for none
   */
  public Service setConfigVersion(java.lang.Long configVersion) {
    this.configVersion = configVersion;
    return this;
  }

  /**
   * Context configuration.
   * @return value or {@code null} for none
   */
  public Context getContext() {
    return context;
  }

  /**
   * Context configuration.
   * @param context context or {@code null} for none
   */
  public Service setContext(Context context) {
    this.context = context;
    return this;
  }

  /**
   * Configuration for the service control plane.
   * @return value or {@code null} for none
   */
  public Control getControl() {
    return control;
  }

  /**
   * Configuration for the service control plane.
   * @param control control or {@code null} for none
   */
  public Service setControl(Control control) {
    this.control = control;
    return this;
  }

  /**
   * Custom error configuration.
   * @return value or {@code null} for none
   */
  public CustomError getCustomError() {
    return customError;
  }

  /**
   * Custom error configuration.
   * @param customError customError or {@code null} for none
   */
  public Service setCustomError(CustomError customError) {
    this.customError = customError;
    return this;
  }

  /**
   * Additional API documentation.
   * @return value or {@code null} for none
   */
  public Documentation getDocumentation() {
    return documentation;
  }

  /**
   * Additional API documentation.
   * @param documentation documentation or {@code null} for none
   */
  public Service setDocumentation(Documentation documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Configuration for network endpoints.  If this is empty, then an endpoint with the same name as
   * the service is automatically generated to service all defined APIs.
   * @return value or {@code null} for none
   */
  public java.util.List<Endpoint> getEndpoints() {
    return endpoints;
  }

  /**
   * Configuration for network endpoints.  If this is empty, then an endpoint with the same name as
   * the service is automatically generated to service all defined APIs.
   * @param endpoints endpoints or {@code null} for none
   */
  public Service setEndpoints(java.util.List<Endpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  /**
   * A list of all enum types included in this API service.  Enums referenced directly or indirectly
   * by the `apis` are automatically included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *
   *     enums:     - name: google.someapi.v1.SomeEnum
   * @return value or {@code null} for none
   */
  public java.util.List<ServiceConsumerManagementEnum> getEnums() {
    return enums;
  }

  /**
   * A list of all enum types included in this API service.  Enums referenced directly or indirectly
   * by the `apis` are automatically included.  Enums which are not referenced but shall be included
   * should be listed here by name. Example:
   *
   *     enums:     - name: google.someapi.v1.SomeEnum
   * @param enums enums or {@code null} for none
   */
  public Service setEnums(java.util.List<ServiceConsumerManagementEnum> enums) {
    this.enums = enums;
    return this;
  }

  /**
   * HTTP configuration.
   * @return value or {@code null} for none
   */
  public Http getHttp() {
    return http;
  }

  /**
   * HTTP configuration.
   * @param http http or {@code null} for none
   */
  public Service setHttp(Http http) {
    this.http = http;
    return this;
  }

  /**
   * A unique ID for a specific instance of this message, typically assigned by the client for
   * tracking purpose. Must be no longer than 63 characters and only lower case letters, digits,
   * '.', '_' and '-' are allowed. If empty, the server may choose to generate one instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * A unique ID for a specific instance of this message, typically assigned by the client for
   * tracking purpose. Must be no longer than 63 characters and only lower case letters, digits,
   * '.', '_' and '-' are allowed. If empty, the server may choose to generate one instead.
   * @param id id or {@code null} for none
   */
  public Service setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Logging configuration.
   * @return value or {@code null} for none
   */
  public Logging getLogging() {
    return logging;
  }

  /**
   * Logging configuration.
   * @param logging logging or {@code null} for none
   */
  public Service setLogging(Logging logging) {
    this.logging = logging;
    return this;
  }

  /**
   * Defines the logs used by this service.
   * @return value or {@code null} for none
   */
  public java.util.List<LogDescriptor> getLogs() {
    return logs;
  }

  /**
   * Defines the logs used by this service.
   * @param logs logs or {@code null} for none
   */
  public Service setLogs(java.util.List<LogDescriptor> logs) {
    this.logs = logs;
    return this;
  }

  /**
   * Defines the metrics used by this service.
   * @return value or {@code null} for none
   */
  public java.util.List<MetricDescriptor> getMetrics() {
    return metrics;
  }

  /**
   * Defines the metrics used by this service.
   * @param metrics metrics or {@code null} for none
   */
  public Service setMetrics(java.util.List<MetricDescriptor> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Defines the monitored resources used by this service. This is required by the
   * Service.monitoring and Service.logging configurations.
   * @return value or {@code null} for none
   */
  public java.util.List<MonitoredResourceDescriptor> getMonitoredResources() {
    return monitoredResources;
  }

  /**
   * Defines the monitored resources used by this service. This is required by the
   * Service.monitoring and Service.logging configurations.
   * @param monitoredResources monitoredResources or {@code null} for none
   */
  public Service setMonitoredResources(java.util.List<MonitoredResourceDescriptor> monitoredResources) {
    this.monitoredResources = monitoredResources;
    return this;
  }

  /**
   * Monitoring configuration.
   * @return value or {@code null} for none
   */
  public Monitoring getMonitoring() {
    return monitoring;
  }

  /**
   * Monitoring configuration.
   * @param monitoring monitoring or {@code null} for none
   */
  public Service setMonitoring(Monitoring monitoring) {
    this.monitoring = monitoring;
    return this;
  }

  /**
   * The service name, which is a DNS-like logical identifier for the service, such as
   * `calendar.googleapis.com`. The service name typically goes through DNS verification to make
   * sure the owner of the service also owns the DNS name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The service name, which is a DNS-like logical identifier for the service, such as
   * `calendar.googleapis.com`. The service name typically goes through DNS verification to make
   * sure the owner of the service also owns the DNS name.
   * @param name name or {@code null} for none
   */
  public Service setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The Google project that owns this service.
   * @return value or {@code null} for none
   */
  public java.lang.String getProducerProjectId() {
    return producerProjectId;
  }

  /**
   * The Google project that owns this service.
   * @param producerProjectId producerProjectId or {@code null} for none
   */
  public Service setProducerProjectId(java.lang.String producerProjectId) {
    this.producerProjectId = producerProjectId;
    return this;
  }

  /**
   * Quota configuration.
   * @return value or {@code null} for none
   */
  public Quota getQuota() {
    return quota;
  }

  /**
   * Quota configuration.
   * @param quota quota or {@code null} for none
   */
  public Service setQuota(Quota quota) {
    this.quota = quota;
    return this;
  }

  /**
   * Output only. The source information for this configuration if available.
   * @return value or {@code null} for none
   */
  public SourceInfo getSourceInfo() {
    return sourceInfo;
  }

  /**
   * Output only. The source information for this configuration if available.
   * @param sourceInfo sourceInfo or {@code null} for none
   */
  public Service setSourceInfo(SourceInfo sourceInfo) {
    this.sourceInfo = sourceInfo;
    return this;
  }

  /**
   * System parameter configuration.
   * @return value or {@code null} for none
   */
  public SystemParameters getSystemParameters() {
    return systemParameters;
  }

  /**
   * System parameter configuration.
   * @param systemParameters systemParameters or {@code null} for none
   */
  public Service setSystemParameters(SystemParameters systemParameters) {
    this.systemParameters = systemParameters;
    return this;
  }

  /**
   * A list of all proto message types included in this API service. It serves similar purpose as
   * [google.api.Service.types], except that these types are not needed by user-defined APIs.
   * Therefore, they will not show up in the generated discovery doc. This field should only be used
   * to define system APIs in ESF.
   * @return value or {@code null} for none
   */
  public java.util.List<Type> getSystemTypes() {
    return systemTypes;
  }

  /**
   * A list of all proto message types included in this API service. It serves similar purpose as
   * [google.api.Service.types], except that these types are not needed by user-defined APIs.
   * Therefore, they will not show up in the generated discovery doc. This field should only be used
   * to define system APIs in ESF.
   * @param systemTypes systemTypes or {@code null} for none
   */
  public Service setSystemTypes(java.util.List<Type> systemTypes) {
    this.systemTypes = systemTypes;
    return this;
  }

  /**
   * The product title for this service.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The product title for this service.
   * @param title title or {@code null} for none
   */
  public Service setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * A list of all proto message types included in this API service. Types referenced directly or
   * indirectly by the `apis` are automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type, should be listed here
   * by name. Example:
   *
   *     types:     - name: google.protobuf.Int32
   * @return value or {@code null} for none
   */
  public java.util.List<Type> getTypes() {
    return types;
  }

  /**
   * A list of all proto message types included in this API service. Types referenced directly or
   * indirectly by the `apis` are automatically included.  Messages which are not referenced but
   * shall be included, such as types used by the `google.protobuf.Any` type, should be listed here
   * by name. Example:
   *
   *     types:     - name: google.protobuf.Int32
   * @param types types or {@code null} for none
   */
  public Service setTypes(java.util.List<Type> types) {
    this.types = types;
    return this;
  }

  /**
   * Configuration controlling usage of this service.
   * @return value or {@code null} for none
   */
  public Usage getUsage() {
    return usage;
  }

  /**
   * Configuration controlling usage of this service.
   * @param usage usage or {@code null} for none
   */
  public Service setUsage(Usage usage) {
    this.usage = usage;
    return this;
  }

  @Override
  public Service set(String fieldName, Object value) {
    return (Service) super.set(fieldName, value);
  }

  @Override
  public Service clone() {
    return (Service) super.clone();
  }

}
