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

package com.google.api.services.monitoring.v3.model;

/**
 * Distribution contains summary statistics for a population of values. It optionally contains a
 * histogram representing the distribution of those values across a set of buckets.The summary
 * statistics are the count, mean, sum of the squared deviation from the mean, the minimum, and the
 * maximum of the set of population of values. The histogram is based on a sequence of buckets and
 * gives a count of values that fall into each bucket. The boundaries of the buckets are given
 * either explicitly or by formulas for buckets of fixed or exponentially increasing widths.Although
 * it is not forbidden, it is generally a bad idea to include non-finite values (infinities or NaNs)
 * in the population of values, as this will render the mean and sum_of_squared_deviation fields
 * meaningless.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Distribution extends com.google.api.client.json.GenericJson {

  /**
   * Required in the Cloud Monitoring API v3. The values for each bucket specified in
   * bucket_options. The sum of the values in bucketCounts must equal the value in the count field
   * of the Distribution object. The order of the bucket counts follows the numbering schemes
   * described for the three bucket types. The underflow bucket has number 0; the finite buckets, if
   * any, have numbers 1 through N-2; and the overflow bucket has number N-1. The size of
   * bucket_counts must not be greater than N. If the size is less than N, then the remaining
   * buckets are assigned values of zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> bucketCounts;

  /**
   * Required in the Cloud Monitoring API v3. Defines the histogram bucket boundaries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BucketOptions bucketOptions;

  /**
   * The number of values in the population. Must be non-negative. This value must equal the sum of
   * the values in bucket_counts if a histogram is provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * Must be in increasing order of value field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Exemplar> exemplars;

  /**
   * The arithmetic mean of the values in the population. If count is zero then this field must be
   * zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double mean;

  /**
   * If specified, contains the range of the population values. The field must not be present if the
   * count is zero. This field is presently ignored by the Cloud Monitoring API v3.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Range range;

  /**
   * The sum of squared deviations from the mean of the values in the population. For values x_i
   * this is: Sum[i=1..n]((x_i - mean)^2) Knuth, "The Art of Computer Programming", Vol. 2, page
   * 232, 3rd edition describes Welford's method for accumulating this sum in one pass.If count is
   * zero then this field must be zero.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double sumOfSquaredDeviation;

  /**
   * Required in the Cloud Monitoring API v3. The values for each bucket specified in
   * bucket_options. The sum of the values in bucketCounts must equal the value in the count field
   * of the Distribution object. The order of the bucket counts follows the numbering schemes
   * described for the three bucket types. The underflow bucket has number 0; the finite buckets, if
   * any, have numbers 1 through N-2; and the overflow bucket has number N-1. The size of
   * bucket_counts must not be greater than N. If the size is less than N, then the remaining
   * buckets are assigned values of zero.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getBucketCounts() {
    return bucketCounts;
  }

  /**
   * Required in the Cloud Monitoring API v3. The values for each bucket specified in
   * bucket_options. The sum of the values in bucketCounts must equal the value in the count field
   * of the Distribution object. The order of the bucket counts follows the numbering schemes
   * described for the three bucket types. The underflow bucket has number 0; the finite buckets, if
   * any, have numbers 1 through N-2; and the overflow bucket has number N-1. The size of
   * bucket_counts must not be greater than N. If the size is less than N, then the remaining
   * buckets are assigned values of zero.
   * @param bucketCounts bucketCounts or {@code null} for none
   */
  public Distribution setBucketCounts(java.util.List<java.lang.Long> bucketCounts) {
    this.bucketCounts = bucketCounts;
    return this;
  }

  /**
   * Required in the Cloud Monitoring API v3. Defines the histogram bucket boundaries.
   * @return value or {@code null} for none
   */
  public BucketOptions getBucketOptions() {
    return bucketOptions;
  }

  /**
   * Required in the Cloud Monitoring API v3. Defines the histogram bucket boundaries.
   * @param bucketOptions bucketOptions or {@code null} for none
   */
  public Distribution setBucketOptions(BucketOptions bucketOptions) {
    this.bucketOptions = bucketOptions;
    return this;
  }

  /**
   * The number of values in the population. Must be non-negative. This value must equal the sum of
   * the values in bucket_counts if a histogram is provided.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * The number of values in the population. Must be non-negative. This value must equal the sum of
   * the values in bucket_counts if a histogram is provided.
   * @param count count or {@code null} for none
   */
  public Distribution setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * Must be in increasing order of value field.
   * @return value or {@code null} for none
   */
  public java.util.List<Exemplar> getExemplars() {
    return exemplars;
  }

  /**
   * Must be in increasing order of value field.
   * @param exemplars exemplars or {@code null} for none
   */
  public Distribution setExemplars(java.util.List<Exemplar> exemplars) {
    this.exemplars = exemplars;
    return this;
  }

  /**
   * The arithmetic mean of the values in the population. If count is zero then this field must be
   * zero.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMean() {
    return mean;
  }

  /**
   * The arithmetic mean of the values in the population. If count is zero then this field must be
   * zero.
   * @param mean mean or {@code null} for none
   */
  public Distribution setMean(java.lang.Double mean) {
    this.mean = mean;
    return this;
  }

  /**
   * If specified, contains the range of the population values. The field must not be present if the
   * count is zero. This field is presently ignored by the Cloud Monitoring API v3.
   * @return value or {@code null} for none
   */
  public Range getRange() {
    return range;
  }

  /**
   * If specified, contains the range of the population values. The field must not be present if the
   * count is zero. This field is presently ignored by the Cloud Monitoring API v3.
   * @param range range or {@code null} for none
   */
  public Distribution setRange(Range range) {
    this.range = range;
    return this;
  }

  /**
   * The sum of squared deviations from the mean of the values in the population. For values x_i
   * this is: Sum[i=1..n]((x_i - mean)^2) Knuth, "The Art of Computer Programming", Vol. 2, page
   * 232, 3rd edition describes Welford's method for accumulating this sum in one pass.If count is
   * zero then this field must be zero.
   * @return value or {@code null} for none
   */
  public java.lang.Double getSumOfSquaredDeviation() {
    return sumOfSquaredDeviation;
  }

  /**
   * The sum of squared deviations from the mean of the values in the population. For values x_i
   * this is: Sum[i=1..n]((x_i - mean)^2) Knuth, "The Art of Computer Programming", Vol. 2, page
   * 232, 3rd edition describes Welford's method for accumulating this sum in one pass.If count is
   * zero then this field must be zero.
   * @param sumOfSquaredDeviation sumOfSquaredDeviation or {@code null} for none
   */
  public Distribution setSumOfSquaredDeviation(java.lang.Double sumOfSquaredDeviation) {
    this.sumOfSquaredDeviation = sumOfSquaredDeviation;
    return this;
  }

  @Override
  public Distribution set(String fieldName, Object value) {
    return (Distribution) super.set(fieldName, value);
  }

  @Override
  public Distribution clone() {
    return (Distribution) super.clone();
  }

}
