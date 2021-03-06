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

package com.google.api.services.doubleclicksearch.model;

/**
 * A request object used to create a DoubleClick Search report.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Ads 360 API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportApiColumnSpec extends com.google.api.client.json.GenericJson {

  /**
   * Name of a DoubleClick Search column to include in the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String columnName;

  /**
   * Segments a report by a custom dimension. The report must be scoped to an advertiser or lower,
   * and the custom dimension must already be set up in DoubleClick Search. The custom dimension
   * name, which appears in DoubleClick Search, is case sensitive.\ If used in a conversion report,
   * returns the value of the specified custom dimension for the given conversion, if set. This
   * column does not segment the conversion report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customDimensionName;

  /**
   * Name of a custom metric to include in the report. The report must be scoped to an advertiser or
   * lower, and the custom metric must already be set up in DoubleClick Search. The custom metric
   * name, which appears in DoubleClick Search, is case sensitive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customMetricName;

  /**
   * Inclusive day in YYYY-MM-DD format. When provided, this overrides the overall time range of the
   * report for this column only. Must be provided together with `startDate`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endDate;

  /**
   * Synchronous report only. Set to `true` to group by this column. Defaults to `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean groupByColumn;

  /**
   * Text used to identify this column in the report output; defaults to `columnName` or
   * `savedColumnName` when not specified. This can be used to prevent collisions between
   * DoubleClick Search columns and saved columns with the same name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String headerText;

  /**
   * The platform that is used to provide data for the custom dimension. Acceptable values are
   * "floodlight".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platformSource;

  /**
   * Returns metrics only for a specific type of product activity. Accepted values are: - "`sold`":
   * returns metrics only for products that were sold - "`advertised`": returns metrics only for
   * products that were advertised in a Shopping campaign, and that might or might not have been
   * sold
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productReportPerspective;

  /**
   * Name of a saved column to include in the report. The report must be scoped at advertiser or
   * lower, and this saved column must already be created in the DoubleClick Search UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String savedColumnName;

  /**
   * Inclusive date in YYYY-MM-DD format. When provided, this overrides the overall time range of
   * the report for this column only. Must be provided together with `endDate`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startDate;

  /**
   * Name of a DoubleClick Search column to include in the report.
   * @return value or {@code null} for none
   */
  public java.lang.String getColumnName() {
    return columnName;
  }

  /**
   * Name of a DoubleClick Search column to include in the report.
   * @param columnName columnName or {@code null} for none
   */
  public ReportApiColumnSpec setColumnName(java.lang.String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Segments a report by a custom dimension. The report must be scoped to an advertiser or lower,
   * and the custom dimension must already be set up in DoubleClick Search. The custom dimension
   * name, which appears in DoubleClick Search, is case sensitive.\ If used in a conversion report,
   * returns the value of the specified custom dimension for the given conversion, if set. This
   * column does not segment the conversion report.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomDimensionName() {
    return customDimensionName;
  }

  /**
   * Segments a report by a custom dimension. The report must be scoped to an advertiser or lower,
   * and the custom dimension must already be set up in DoubleClick Search. The custom dimension
   * name, which appears in DoubleClick Search, is case sensitive.\ If used in a conversion report,
   * returns the value of the specified custom dimension for the given conversion, if set. This
   * column does not segment the conversion report.
   * @param customDimensionName customDimensionName or {@code null} for none
   */
  public ReportApiColumnSpec setCustomDimensionName(java.lang.String customDimensionName) {
    this.customDimensionName = customDimensionName;
    return this;
  }

  /**
   * Name of a custom metric to include in the report. The report must be scoped to an advertiser or
   * lower, and the custom metric must already be set up in DoubleClick Search. The custom metric
   * name, which appears in DoubleClick Search, is case sensitive.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomMetricName() {
    return customMetricName;
  }

  /**
   * Name of a custom metric to include in the report. The report must be scoped to an advertiser or
   * lower, and the custom metric must already be set up in DoubleClick Search. The custom metric
   * name, which appears in DoubleClick Search, is case sensitive.
   * @param customMetricName customMetricName or {@code null} for none
   */
  public ReportApiColumnSpec setCustomMetricName(java.lang.String customMetricName) {
    this.customMetricName = customMetricName;
    return this;
  }

  /**
   * Inclusive day in YYYY-MM-DD format. When provided, this overrides the overall time range of the
   * report for this column only. Must be provided together with `startDate`.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndDate() {
    return endDate;
  }

  /**
   * Inclusive day in YYYY-MM-DD format. When provided, this overrides the overall time range of the
   * report for this column only. Must be provided together with `startDate`.
   * @param endDate endDate or {@code null} for none
   */
  public ReportApiColumnSpec setEndDate(java.lang.String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Synchronous report only. Set to `true` to group by this column. Defaults to `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGroupByColumn() {
    return groupByColumn;
  }

  /**
   * Synchronous report only. Set to `true` to group by this column. Defaults to `false`.
   * @param groupByColumn groupByColumn or {@code null} for none
   */
  public ReportApiColumnSpec setGroupByColumn(java.lang.Boolean groupByColumn) {
    this.groupByColumn = groupByColumn;
    return this;
  }

  /**
   * Text used to identify this column in the report output; defaults to `columnName` or
   * `savedColumnName` when not specified. This can be used to prevent collisions between
   * DoubleClick Search columns and saved columns with the same name.
   * @return value or {@code null} for none
   */
  public java.lang.String getHeaderText() {
    return headerText;
  }

  /**
   * Text used to identify this column in the report output; defaults to `columnName` or
   * `savedColumnName` when not specified. This can be used to prevent collisions between
   * DoubleClick Search columns and saved columns with the same name.
   * @param headerText headerText or {@code null} for none
   */
  public ReportApiColumnSpec setHeaderText(java.lang.String headerText) {
    this.headerText = headerText;
    return this;
  }

  /**
   * The platform that is used to provide data for the custom dimension. Acceptable values are
   * "floodlight".
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatformSource() {
    return platformSource;
  }

  /**
   * The platform that is used to provide data for the custom dimension. Acceptable values are
   * "floodlight".
   * @param platformSource platformSource or {@code null} for none
   */
  public ReportApiColumnSpec setPlatformSource(java.lang.String platformSource) {
    this.platformSource = platformSource;
    return this;
  }

  /**
   * Returns metrics only for a specific type of product activity. Accepted values are: - "`sold`":
   * returns metrics only for products that were sold - "`advertised`": returns metrics only for
   * products that were advertised in a Shopping campaign, and that might or might not have been
   * sold
   * @return value or {@code null} for none
   */
  public java.lang.String getProductReportPerspective() {
    return productReportPerspective;
  }

  /**
   * Returns metrics only for a specific type of product activity. Accepted values are: - "`sold`":
   * returns metrics only for products that were sold - "`advertised`": returns metrics only for
   * products that were advertised in a Shopping campaign, and that might or might not have been
   * sold
   * @param productReportPerspective productReportPerspective or {@code null} for none
   */
  public ReportApiColumnSpec setProductReportPerspective(java.lang.String productReportPerspective) {
    this.productReportPerspective = productReportPerspective;
    return this;
  }

  /**
   * Name of a saved column to include in the report. The report must be scoped at advertiser or
   * lower, and this saved column must already be created in the DoubleClick Search UI.
   * @return value or {@code null} for none
   */
  public java.lang.String getSavedColumnName() {
    return savedColumnName;
  }

  /**
   * Name of a saved column to include in the report. The report must be scoped at advertiser or
   * lower, and this saved column must already be created in the DoubleClick Search UI.
   * @param savedColumnName savedColumnName or {@code null} for none
   */
  public ReportApiColumnSpec setSavedColumnName(java.lang.String savedColumnName) {
    this.savedColumnName = savedColumnName;
    return this;
  }

  /**
   * Inclusive date in YYYY-MM-DD format. When provided, this overrides the overall time range of
   * the report for this column only. Must be provided together with `endDate`.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartDate() {
    return startDate;
  }

  /**
   * Inclusive date in YYYY-MM-DD format. When provided, this overrides the overall time range of
   * the report for this column only. Must be provided together with `endDate`.
   * @param startDate startDate or {@code null} for none
   */
  public ReportApiColumnSpec setStartDate(java.lang.String startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public ReportApiColumnSpec set(String fieldName, Object value) {
    return (ReportApiColumnSpec) super.set(fieldName, value);
  }

  @Override
  public ReportApiColumnSpec clone() {
    return (ReportApiColumnSpec) super.clone();
  }

}
