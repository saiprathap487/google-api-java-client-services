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

package com.google.api.services.analyticsdata.v1alpha;

/**
 * Service definition for AnalyticsData (v1alpha).
 *
 * <p>
 * Accesses report data in Google Analytics.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/analytics/trusted-testing/analytics-data/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AnalyticsDataRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class AnalyticsData extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.10 of the Google Analytics Data API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://analyticsdata.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public AnalyticsData(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  AnalyticsData(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Properties collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code AnalyticsData analyticsdata = new AnalyticsData(...);}
   *   {@code AnalyticsData.Properties.List request = analyticsdata.properties().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Properties properties() {
    return new Properties();
  }

  /**
   * The "properties" collection of methods.
   */
  public class Properties {

    /**
     * Returns metadata for dimensions and metrics available in reporting methods. Used to explore the
     * dimensions and metrics. In this method, a Google Analytics GA4 Property Identifier is specified
     * in the request, and the metadata response includes Custom dimensions and metrics as well as
     * Universal metadata. For example if a custom metric with parameter name `levels_unlocked` is
     * registered to a property, the Metadata response will contain `customEvent:levels_unlocked`.
     * Universal metadata are dimensions and metrics applicable to any property such as `country` and
     * `totalUsers`.
     *
     * Create a request for the method "properties.getMetadata".
     *
     * This request holds the parameters needed by the analyticsdata server.  After setting any optional
     * parameters, call the {@link GetMetadata#execute()} method to invoke the remote operation.
     *
     * @param name Required. The resource name of the metadata to retrieve. This name field is specified in the URL
     *        path and not URL parameters. Property is a numeric Google Analytics GA4 Property
     *        identifier. To learn more, see [where to find your Property
     *        ID](https://developers.google.com/analytics/trusted-testing/analytics-data/property-id).
     *        Example: properties/1234/metadata
     * @return the request
     */
    public GetMetadata getMetadata(java.lang.String name) throws java.io.IOException {
      GetMetadata result = new GetMetadata(name);
      initialize(result);
      return result;
    }

    public class GetMetadata extends AnalyticsDataRequest<com.google.api.services.analyticsdata.v1alpha.model.Metadata> {

      private static final String REST_PATH = "v1alpha/{+name}";

      private final java.util.regex.Pattern NAME_PATTERN =
          java.util.regex.Pattern.compile("^properties/[^/]+/metadata$");

      /**
       * Returns metadata for dimensions and metrics available in reporting methods. Used to explore the
       * dimensions and metrics. In this method, a Google Analytics GA4 Property Identifier is specified
       * in the request, and the metadata response includes Custom dimensions and metrics as well as
       * Universal metadata. For example if a custom metric with parameter name `levels_unlocked` is
       * registered to a property, the Metadata response will contain `customEvent:levels_unlocked`.
       * Universal metadata are dimensions and metrics applicable to any property such as `country` and
       * `totalUsers`.
       *
       * Create a request for the method "properties.getMetadata".
       *
       * This request holds the parameters needed by the the analyticsdata server.  After setting any
       * optional parameters, call the {@link GetMetadata#execute()} method to invoke the remote
       * operation. <p> {@link
       * GetMetadata#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param name Required. The resource name of the metadata to retrieve. This name field is specified in the URL
     *        path and not URL parameters. Property is a numeric Google Analytics GA4 Property
     *        identifier. To learn more, see [where to find your Property
     *        ID](https://developers.google.com/analytics/trusted-testing/analytics-data/property-id).
     *        Example: properties/1234/metadata
       * @since 1.13
       */
      protected GetMetadata(java.lang.String name) {
        super(AnalyticsData.this, "GET", REST_PATH, null, com.google.api.services.analyticsdata.v1alpha.model.Metadata.class);
        this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^properties/[^/]+/metadata$");
        }
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public GetMetadata set$Xgafv(java.lang.String $Xgafv) {
        return (GetMetadata) super.set$Xgafv($Xgafv);
      }

      @Override
      public GetMetadata setAccessToken(java.lang.String accessToken) {
        return (GetMetadata) super.setAccessToken(accessToken);
      }

      @Override
      public GetMetadata setAlt(java.lang.String alt) {
        return (GetMetadata) super.setAlt(alt);
      }

      @Override
      public GetMetadata setCallback(java.lang.String callback) {
        return (GetMetadata) super.setCallback(callback);
      }

      @Override
      public GetMetadata setFields(java.lang.String fields) {
        return (GetMetadata) super.setFields(fields);
      }

      @Override
      public GetMetadata setKey(java.lang.String key) {
        return (GetMetadata) super.setKey(key);
      }

      @Override
      public GetMetadata setOauthToken(java.lang.String oauthToken) {
        return (GetMetadata) super.setOauthToken(oauthToken);
      }

      @Override
      public GetMetadata setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetMetadata) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetMetadata setQuotaUser(java.lang.String quotaUser) {
        return (GetMetadata) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetMetadata setUploadType(java.lang.String uploadType) {
        return (GetMetadata) super.setUploadType(uploadType);
      }

      @Override
      public GetMetadata setUploadProtocol(java.lang.String uploadProtocol) {
        return (GetMetadata) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Required. The resource name of the metadata to retrieve. This name field is specified in
       * the URL path and not URL parameters. Property is a numeric Google Analytics GA4 Property
       * identifier. To learn more, see [where to find your Property
       * ID](https://developers.google.com/analytics/trusted-testing/analytics-data/property-id).
       * Example: properties/1234/metadata
       */
      @com.google.api.client.util.Key
      private java.lang.String name;

      /** Required. The resource name of the metadata to retrieve. This name field is specified in the URL
     path and not URL parameters. Property is a numeric Google Analytics GA4 Property identifier. To
     learn more, see [where to find your Property ID](https://developers.google.com/analytics/trusted-
     testing/analytics-data/property-id). Example: properties/1234/metadata
       */
      public java.lang.String getName() {
        return name;
      }

      /**
       * Required. The resource name of the metadata to retrieve. This name field is specified in
       * the URL path and not URL parameters. Property is a numeric Google Analytics GA4 Property
       * identifier. To learn more, see [where to find your Property
       * ID](https://developers.google.com/analytics/trusted-testing/analytics-data/property-id).
       * Example: properties/1234/metadata
       */
      public GetMetadata setName(java.lang.String name) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
              "Parameter name must conform to the pattern " +
              "^properties/[^/]+/metadata$");
        }
        this.name = name;
        return this;
      }

      @Override
      public GetMetadata set(String parameterName, Object value) {
        return (GetMetadata) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the V1alpha collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code AnalyticsData analyticsdata = new AnalyticsData(...);}
   *   {@code AnalyticsData.V1alpha.List request = analyticsdata.v1alpha().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public V1alpha v1alpha() {
    return new V1alpha();
  }

  /**
   * The "v1alpha" collection of methods.
   */
  public class V1alpha {

    /**
     * Returns multiple pivot reports in a batch. All reports must be for the same Entity.
     *
     * Create a request for the method "v1alpha.batchRunPivotReports".
     *
     * This request holds the parameters needed by the analyticsdata server.  After setting any optional
     * parameters, call the {@link BatchRunPivotReports#execute()} method to invoke the remote
     * operation.
     *
     * @param content the {@link com.google.api.services.analyticsdata.v1alpha.model.BatchRunPivotReportsRequest}
     * @return the request
     */
    public BatchRunPivotReports batchRunPivotReports(com.google.api.services.analyticsdata.v1alpha.model.BatchRunPivotReportsRequest content) throws java.io.IOException {
      BatchRunPivotReports result = new BatchRunPivotReports(content);
      initialize(result);
      return result;
    }

    public class BatchRunPivotReports extends AnalyticsDataRequest<com.google.api.services.analyticsdata.v1alpha.model.BatchRunPivotReportsResponse> {

      private static final String REST_PATH = "v1alpha:batchRunPivotReports";

      /**
       * Returns multiple pivot reports in a batch. All reports must be for the same Entity.
       *
       * Create a request for the method "v1alpha.batchRunPivotReports".
       *
       * This request holds the parameters needed by the the analyticsdata server.  After setting any
       * optional parameters, call the {@link BatchRunPivotReports#execute()} method to invoke the
       * remote operation. <p> {@link BatchRunPivotReports#initialize(com.google.api.client.googleapis.s
       * ervices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
       * after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.analyticsdata.v1alpha.model.BatchRunPivotReportsRequest}
       * @since 1.13
       */
      protected BatchRunPivotReports(com.google.api.services.analyticsdata.v1alpha.model.BatchRunPivotReportsRequest content) {
        super(AnalyticsData.this, "POST", REST_PATH, content, com.google.api.services.analyticsdata.v1alpha.model.BatchRunPivotReportsResponse.class);
      }

      @Override
      public BatchRunPivotReports set$Xgafv(java.lang.String $Xgafv) {
        return (BatchRunPivotReports) super.set$Xgafv($Xgafv);
      }

      @Override
      public BatchRunPivotReports setAccessToken(java.lang.String accessToken) {
        return (BatchRunPivotReports) super.setAccessToken(accessToken);
      }

      @Override
      public BatchRunPivotReports setAlt(java.lang.String alt) {
        return (BatchRunPivotReports) super.setAlt(alt);
      }

      @Override
      public BatchRunPivotReports setCallback(java.lang.String callback) {
        return (BatchRunPivotReports) super.setCallback(callback);
      }

      @Override
      public BatchRunPivotReports setFields(java.lang.String fields) {
        return (BatchRunPivotReports) super.setFields(fields);
      }

      @Override
      public BatchRunPivotReports setKey(java.lang.String key) {
        return (BatchRunPivotReports) super.setKey(key);
      }

      @Override
      public BatchRunPivotReports setOauthToken(java.lang.String oauthToken) {
        return (BatchRunPivotReports) super.setOauthToken(oauthToken);
      }

      @Override
      public BatchRunPivotReports setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (BatchRunPivotReports) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public BatchRunPivotReports setQuotaUser(java.lang.String quotaUser) {
        return (BatchRunPivotReports) super.setQuotaUser(quotaUser);
      }

      @Override
      public BatchRunPivotReports setUploadType(java.lang.String uploadType) {
        return (BatchRunPivotReports) super.setUploadType(uploadType);
      }

      @Override
      public BatchRunPivotReports setUploadProtocol(java.lang.String uploadProtocol) {
        return (BatchRunPivotReports) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public BatchRunPivotReports set(String parameterName, Object value) {
        return (BatchRunPivotReports) super.set(parameterName, value);
      }
    }
    /**
     * Returns multiple reports in a batch. All reports must be for the same Entity.
     *
     * Create a request for the method "v1alpha.batchRunReports".
     *
     * This request holds the parameters needed by the analyticsdata server.  After setting any optional
     * parameters, call the {@link BatchRunReports#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.analyticsdata.v1alpha.model.BatchRunReportsRequest}
     * @return the request
     */
    public BatchRunReports batchRunReports(com.google.api.services.analyticsdata.v1alpha.model.BatchRunReportsRequest content) throws java.io.IOException {
      BatchRunReports result = new BatchRunReports(content);
      initialize(result);
      return result;
    }

    public class BatchRunReports extends AnalyticsDataRequest<com.google.api.services.analyticsdata.v1alpha.model.BatchRunReportsResponse> {

      private static final String REST_PATH = "v1alpha:batchRunReports";

      /**
       * Returns multiple reports in a batch. All reports must be for the same Entity.
       *
       * Create a request for the method "v1alpha.batchRunReports".
       *
       * This request holds the parameters needed by the the analyticsdata server.  After setting any
       * optional parameters, call the {@link BatchRunReports#execute()} method to invoke the remote
       * operation. <p> {@link BatchRunReports#initialize(com.google.api.client.googleapis.services.Abst
       * ractGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param content the {@link com.google.api.services.analyticsdata.v1alpha.model.BatchRunReportsRequest}
       * @since 1.13
       */
      protected BatchRunReports(com.google.api.services.analyticsdata.v1alpha.model.BatchRunReportsRequest content) {
        super(AnalyticsData.this, "POST", REST_PATH, content, com.google.api.services.analyticsdata.v1alpha.model.BatchRunReportsResponse.class);
      }

      @Override
      public BatchRunReports set$Xgafv(java.lang.String $Xgafv) {
        return (BatchRunReports) super.set$Xgafv($Xgafv);
      }

      @Override
      public BatchRunReports setAccessToken(java.lang.String accessToken) {
        return (BatchRunReports) super.setAccessToken(accessToken);
      }

      @Override
      public BatchRunReports setAlt(java.lang.String alt) {
        return (BatchRunReports) super.setAlt(alt);
      }

      @Override
      public BatchRunReports setCallback(java.lang.String callback) {
        return (BatchRunReports) super.setCallback(callback);
      }

      @Override
      public BatchRunReports setFields(java.lang.String fields) {
        return (BatchRunReports) super.setFields(fields);
      }

      @Override
      public BatchRunReports setKey(java.lang.String key) {
        return (BatchRunReports) super.setKey(key);
      }

      @Override
      public BatchRunReports setOauthToken(java.lang.String oauthToken) {
        return (BatchRunReports) super.setOauthToken(oauthToken);
      }

      @Override
      public BatchRunReports setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (BatchRunReports) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public BatchRunReports setQuotaUser(java.lang.String quotaUser) {
        return (BatchRunReports) super.setQuotaUser(quotaUser);
      }

      @Override
      public BatchRunReports setUploadType(java.lang.String uploadType) {
        return (BatchRunReports) super.setUploadType(uploadType);
      }

      @Override
      public BatchRunReports setUploadProtocol(java.lang.String uploadProtocol) {
        return (BatchRunReports) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public BatchRunReports set(String parameterName, Object value) {
        return (BatchRunReports) super.set(parameterName, value);
      }
    }
    /**
     * Returns metadata for dimensions and metrics available in reporting methods. Used to explore the
     * dimensions and metrics. Dimensions and metrics will be mostly added over time, but renames and
     * deletions may occur. This method returns Universal Metadata. Universal Metadata are dimensions
     * and metrics applicable to any property such as `country` and `totalUsers`.
     *
     * Create a request for the method "v1alpha.getUniversalMetadata".
     *
     * This request holds the parameters needed by the analyticsdata server.  After setting any optional
     * parameters, call the {@link GetUniversalMetadata#execute()} method to invoke the remote
     * operation.
     *
     * @return the request
     */
    public GetUniversalMetadata getUniversalMetadata() throws java.io.IOException {
      GetUniversalMetadata result = new GetUniversalMetadata();
      initialize(result);
      return result;
    }

    public class GetUniversalMetadata extends AnalyticsDataRequest<com.google.api.services.analyticsdata.v1alpha.model.UniversalMetadata> {

      private static final String REST_PATH = "v1alpha/universalMetadata";

      /**
       * Returns metadata for dimensions and metrics available in reporting methods. Used to explore the
       * dimensions and metrics. Dimensions and metrics will be mostly added over time, but renames and
       * deletions may occur. This method returns Universal Metadata. Universal Metadata are dimensions
       * and metrics applicable to any property such as `country` and `totalUsers`.
       *
       * Create a request for the method "v1alpha.getUniversalMetadata".
       *
       * This request holds the parameters needed by the the analyticsdata server.  After setting any
       * optional parameters, call the {@link GetUniversalMetadata#execute()} method to invoke the
       * remote operation. <p> {@link GetUniversalMetadata#initialize(com.google.api.client.googleapis.s
       * ervices.AbstractGoogleClientRequest)} must be called to initialize this instance immediately
       * after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected GetUniversalMetadata() {
        super(AnalyticsData.this, "GET", REST_PATH, null, com.google.api.services.analyticsdata.v1alpha.model.UniversalMetadata.class);
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public GetUniversalMetadata set$Xgafv(java.lang.String $Xgafv) {
        return (GetUniversalMetadata) super.set$Xgafv($Xgafv);
      }

      @Override
      public GetUniversalMetadata setAccessToken(java.lang.String accessToken) {
        return (GetUniversalMetadata) super.setAccessToken(accessToken);
      }

      @Override
      public GetUniversalMetadata setAlt(java.lang.String alt) {
        return (GetUniversalMetadata) super.setAlt(alt);
      }

      @Override
      public GetUniversalMetadata setCallback(java.lang.String callback) {
        return (GetUniversalMetadata) super.setCallback(callback);
      }

      @Override
      public GetUniversalMetadata setFields(java.lang.String fields) {
        return (GetUniversalMetadata) super.setFields(fields);
      }

      @Override
      public GetUniversalMetadata setKey(java.lang.String key) {
        return (GetUniversalMetadata) super.setKey(key);
      }

      @Override
      public GetUniversalMetadata setOauthToken(java.lang.String oauthToken) {
        return (GetUniversalMetadata) super.setOauthToken(oauthToken);
      }

      @Override
      public GetUniversalMetadata setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (GetUniversalMetadata) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public GetUniversalMetadata setQuotaUser(java.lang.String quotaUser) {
        return (GetUniversalMetadata) super.setQuotaUser(quotaUser);
      }

      @Override
      public GetUniversalMetadata setUploadType(java.lang.String uploadType) {
        return (GetUniversalMetadata) super.setUploadType(uploadType);
      }

      @Override
      public GetUniversalMetadata setUploadProtocol(java.lang.String uploadProtocol) {
        return (GetUniversalMetadata) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public GetUniversalMetadata set(String parameterName, Object value) {
        return (GetUniversalMetadata) super.set(parameterName, value);
      }
    }
    /**
     * Returns a customized pivot report of your Google Analytics event data. Pivot reports are more
     * advanced and expressive formats than regular reports. In a pivot report, dimensions are only
     * visible if they are included in a pivot. Multiple pivots can be specified to further dissect your
     * data.
     *
     * Create a request for the method "v1alpha.runPivotReport".
     *
     * This request holds the parameters needed by the analyticsdata server.  After setting any optional
     * parameters, call the {@link RunPivotReport#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.analyticsdata.v1alpha.model.RunPivotReportRequest}
     * @return the request
     */
    public RunPivotReport runPivotReport(com.google.api.services.analyticsdata.v1alpha.model.RunPivotReportRequest content) throws java.io.IOException {
      RunPivotReport result = new RunPivotReport(content);
      initialize(result);
      return result;
    }

    public class RunPivotReport extends AnalyticsDataRequest<com.google.api.services.analyticsdata.v1alpha.model.RunPivotReportResponse> {

      private static final String REST_PATH = "v1alpha:runPivotReport";

      /**
       * Returns a customized pivot report of your Google Analytics event data. Pivot reports are more
       * advanced and expressive formats than regular reports. In a pivot report, dimensions are only
       * visible if they are included in a pivot. Multiple pivots can be specified to further dissect
       * your data.
       *
       * Create a request for the method "v1alpha.runPivotReport".
       *
       * This request holds the parameters needed by the the analyticsdata server.  After setting any
       * optional parameters, call the {@link RunPivotReport#execute()} method to invoke the remote
       * operation. <p> {@link RunPivotReport#initialize(com.google.api.client.googleapis.services.Abstr
       * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param content the {@link com.google.api.services.analyticsdata.v1alpha.model.RunPivotReportRequest}
       * @since 1.13
       */
      protected RunPivotReport(com.google.api.services.analyticsdata.v1alpha.model.RunPivotReportRequest content) {
        super(AnalyticsData.this, "POST", REST_PATH, content, com.google.api.services.analyticsdata.v1alpha.model.RunPivotReportResponse.class);
      }

      @Override
      public RunPivotReport set$Xgafv(java.lang.String $Xgafv) {
        return (RunPivotReport) super.set$Xgafv($Xgafv);
      }

      @Override
      public RunPivotReport setAccessToken(java.lang.String accessToken) {
        return (RunPivotReport) super.setAccessToken(accessToken);
      }

      @Override
      public RunPivotReport setAlt(java.lang.String alt) {
        return (RunPivotReport) super.setAlt(alt);
      }

      @Override
      public RunPivotReport setCallback(java.lang.String callback) {
        return (RunPivotReport) super.setCallback(callback);
      }

      @Override
      public RunPivotReport setFields(java.lang.String fields) {
        return (RunPivotReport) super.setFields(fields);
      }

      @Override
      public RunPivotReport setKey(java.lang.String key) {
        return (RunPivotReport) super.setKey(key);
      }

      @Override
      public RunPivotReport setOauthToken(java.lang.String oauthToken) {
        return (RunPivotReport) super.setOauthToken(oauthToken);
      }

      @Override
      public RunPivotReport setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (RunPivotReport) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public RunPivotReport setQuotaUser(java.lang.String quotaUser) {
        return (RunPivotReport) super.setQuotaUser(quotaUser);
      }

      @Override
      public RunPivotReport setUploadType(java.lang.String uploadType) {
        return (RunPivotReport) super.setUploadType(uploadType);
      }

      @Override
      public RunPivotReport setUploadProtocol(java.lang.String uploadProtocol) {
        return (RunPivotReport) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public RunPivotReport set(String parameterName, Object value) {
        return (RunPivotReport) super.set(parameterName, value);
      }
    }
    /**
     * Returns a customized report of your Google Analytics event data. Reports contain statistics
     * derived from data collected by the Google Analytics tracking code. The data returned from the API
     * is as a table with columns for the requested dimensions and metrics. Metrics are individual
     * measurements of user activity on your property, such as active users or event count. Dimensions
     * break down metrics across some common criteria, such as country or event name.
     *
     * Create a request for the method "v1alpha.runReport".
     *
     * This request holds the parameters needed by the analyticsdata server.  After setting any optional
     * parameters, call the {@link RunReport#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.google.api.services.analyticsdata.v1alpha.model.RunReportRequest}
     * @return the request
     */
    public RunReport runReport(com.google.api.services.analyticsdata.v1alpha.model.RunReportRequest content) throws java.io.IOException {
      RunReport result = new RunReport(content);
      initialize(result);
      return result;
    }

    public class RunReport extends AnalyticsDataRequest<com.google.api.services.analyticsdata.v1alpha.model.RunReportResponse> {

      private static final String REST_PATH = "v1alpha:runReport";

      /**
       * Returns a customized report of your Google Analytics event data. Reports contain statistics
       * derived from data collected by the Google Analytics tracking code. The data returned from the
       * API is as a table with columns for the requested dimensions and metrics. Metrics are individual
       * measurements of user activity on your property, such as active users or event count. Dimensions
       * break down metrics across some common criteria, such as country or event name.
       *
       * Create a request for the method "v1alpha.runReport".
       *
       * This request holds the parameters needed by the the analyticsdata server.  After setting any
       * optional parameters, call the {@link RunReport#execute()} method to invoke the remote
       * operation. <p> {@link
       * RunReport#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param content the {@link com.google.api.services.analyticsdata.v1alpha.model.RunReportRequest}
       * @since 1.13
       */
      protected RunReport(com.google.api.services.analyticsdata.v1alpha.model.RunReportRequest content) {
        super(AnalyticsData.this, "POST", REST_PATH, content, com.google.api.services.analyticsdata.v1alpha.model.RunReportResponse.class);
      }

      @Override
      public RunReport set$Xgafv(java.lang.String $Xgafv) {
        return (RunReport) super.set$Xgafv($Xgafv);
      }

      @Override
      public RunReport setAccessToken(java.lang.String accessToken) {
        return (RunReport) super.setAccessToken(accessToken);
      }

      @Override
      public RunReport setAlt(java.lang.String alt) {
        return (RunReport) super.setAlt(alt);
      }

      @Override
      public RunReport setCallback(java.lang.String callback) {
        return (RunReport) super.setCallback(callback);
      }

      @Override
      public RunReport setFields(java.lang.String fields) {
        return (RunReport) super.setFields(fields);
      }

      @Override
      public RunReport setKey(java.lang.String key) {
        return (RunReport) super.setKey(key);
      }

      @Override
      public RunReport setOauthToken(java.lang.String oauthToken) {
        return (RunReport) super.setOauthToken(oauthToken);
      }

      @Override
      public RunReport setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (RunReport) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public RunReport setQuotaUser(java.lang.String quotaUser) {
        return (RunReport) super.setQuotaUser(quotaUser);
      }

      @Override
      public RunReport setUploadType(java.lang.String uploadType) {
        return (RunReport) super.setUploadType(uploadType);
      }

      @Override
      public RunReport setUploadProtocol(java.lang.String uploadProtocol) {
        return (RunReport) super.setUploadProtocol(uploadProtocol);
      }

      @Override
      public RunReport set(String parameterName, Object value) {
        return (RunReport) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link AnalyticsData}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link AnalyticsData}. */
    @Override
    public AnalyticsData build() {
      return new AnalyticsData(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link AnalyticsDataRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAnalyticsDataRequestInitializer(
        AnalyticsDataRequestInitializer analyticsdataRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(analyticsdataRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
