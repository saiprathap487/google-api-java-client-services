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

package com.google.api.services.iam.v1.model;

/**
 * The request to lint a Cloud IAM policy object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LintPolicyRequest extends com.google.api.client.json.GenericJson {

  /**
   * google.iam.v1.Binding.condition object to be linted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Expr condition;

  /**
   * The full resource name of the policy this lint request is about. The name follows the Google
   * Cloud Platform (GCP) resource format. For example, a GCP project with ID `my-project` will be
   * named `//cloudresourcemanager.googleapis.com/projects/my-project`. The resource name is not
   * used to read the policy instance from the Cloud IAM database. The candidate policy for lint has
   * to be provided in the same request object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullResourceName;

  /**
   * google.iam.v1.Binding.condition object to be linted.
   * @return value or {@code null} for none
   */
  public Expr getCondition() {
    return condition;
  }

  /**
   * google.iam.v1.Binding.condition object to be linted.
   * @param condition condition or {@code null} for none
   */
  public LintPolicyRequest setCondition(Expr condition) {
    this.condition = condition;
    return this;
  }

  /**
   * The full resource name of the policy this lint request is about. The name follows the Google
   * Cloud Platform (GCP) resource format. For example, a GCP project with ID `my-project` will be
   * named `//cloudresourcemanager.googleapis.com/projects/my-project`. The resource name is not
   * used to read the policy instance from the Cloud IAM database. The candidate policy for lint has
   * to be provided in the same request object.
   * @return value or {@code null} for none
   */
  public java.lang.String getFullResourceName() {
    return fullResourceName;
  }

  /**
   * The full resource name of the policy this lint request is about. The name follows the Google
   * Cloud Platform (GCP) resource format. For example, a GCP project with ID `my-project` will be
   * named `//cloudresourcemanager.googleapis.com/projects/my-project`. The resource name is not
   * used to read the policy instance from the Cloud IAM database. The candidate policy for lint has
   * to be provided in the same request object.
   * @param fullResourceName fullResourceName or {@code null} for none
   */
  public LintPolicyRequest setFullResourceName(java.lang.String fullResourceName) {
    this.fullResourceName = fullResourceName;
    return this;
  }

  @Override
  public LintPolicyRequest set(String fieldName, Object value) {
    return (LintPolicyRequest) super.set(fieldName, value);
  }

  @Override
  public LintPolicyRequest clone() {
    return (LintPolicyRequest) super.clone();
  }

}
