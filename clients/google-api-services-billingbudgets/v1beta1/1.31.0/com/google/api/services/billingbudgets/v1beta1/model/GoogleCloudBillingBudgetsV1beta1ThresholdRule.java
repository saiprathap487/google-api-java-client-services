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

package com.google.api.services.billingbudgets.v1beta1.model;

/**
 * ThresholdRule contains a definition of a threshold which triggers an alert (a notification of a
 * threshold being crossed) to be sent when spend goes above the specified amount. Alerts are
 * automatically e-mailed to users with the Billing Account Administrator role or the Billing
 * Account User role. The thresholds here have no effect on notifications sent to anything
 * configured under `Budget.all_updates_rule`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Billing Budget API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBillingBudgetsV1beta1ThresholdRule extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The type of basis used to determine if spend has passed the threshold. Behavior
   * defaults to CURRENT_SPEND if not set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spendBasis;

  /**
   * Required. Send an alert when this threshold is exceeded. This is a 1.0-based percentage, so 0.5
   * = 50%. Validation: non-negative number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double thresholdPercent;

  /**
   * Optional. The type of basis used to determine if spend has passed the threshold. Behavior
   * defaults to CURRENT_SPEND if not set.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpendBasis() {
    return spendBasis;
  }

  /**
   * Optional. The type of basis used to determine if spend has passed the threshold. Behavior
   * defaults to CURRENT_SPEND if not set.
   * @param spendBasis spendBasis or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1ThresholdRule setSpendBasis(java.lang.String spendBasis) {
    this.spendBasis = spendBasis;
    return this;
  }

  /**
   * Required. Send an alert when this threshold is exceeded. This is a 1.0-based percentage, so 0.5
   * = 50%. Validation: non-negative number.
   * @return value or {@code null} for none
   */
  public java.lang.Double getThresholdPercent() {
    return thresholdPercent;
  }

  /**
   * Required. Send an alert when this threshold is exceeded. This is a 1.0-based percentage, so 0.5
   * = 50%. Validation: non-negative number.
   * @param thresholdPercent thresholdPercent or {@code null} for none
   */
  public GoogleCloudBillingBudgetsV1beta1ThresholdRule setThresholdPercent(java.lang.Double thresholdPercent) {
    this.thresholdPercent = thresholdPercent;
    return this;
  }

  @Override
  public GoogleCloudBillingBudgetsV1beta1ThresholdRule set(String fieldName, Object value) {
    return (GoogleCloudBillingBudgetsV1beta1ThresholdRule) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBillingBudgetsV1beta1ThresholdRule clone() {
    return (GoogleCloudBillingBudgetsV1beta1ThresholdRule) super.clone();
  }

}
