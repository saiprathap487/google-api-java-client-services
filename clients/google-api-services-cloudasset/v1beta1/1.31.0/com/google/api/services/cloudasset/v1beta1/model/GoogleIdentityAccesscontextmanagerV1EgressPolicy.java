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

package com.google.api.services.cloudasset.v1beta1.model;

/**
 * Policy for egress from perimeter. EgressPolicies match requests based on `egress_from` and
 * `egress_to` stanzas. For an EgressPolicy to match, both `egress_from` and `egress_to` stanzas
 * must be matched. If an EgressPolicy matches a request, the request is allowed to span the
 * ServicePerimeter boundary. For example, an EgressPolicy can be used to allow VMs on networks
 * within the ServicePerimeter to access a defined set of projects outside the perimeter in certain
 * contexts (e.g. to read data from a Cloud Storage bucket or query against a BigQuery dataset).
 * EgressPolicies are concerned with the *resources* that a request relates as well as the API
 * services and API actions being used. They do not related to the direction of data movement. More
 * detailed documentation for this concept can be found in the descriptions of EgressFrom and
 * EgressTo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Asset API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleIdentityAccesscontextmanagerV1EgressPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Defines conditions on the source of a request causing this EgressPolicy to apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIdentityAccesscontextmanagerV1EgressFrom egressFrom;

  /**
   * Defines the conditions on the ApiOperation and destination resources that cause this
   * EgressPolicy to apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleIdentityAccesscontextmanagerV1EgressTo egressTo;

  /**
   * Defines conditions on the source of a request causing this EgressPolicy to apply.
   * @return value or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1EgressFrom getEgressFrom() {
    return egressFrom;
  }

  /**
   * Defines conditions on the source of a request causing this EgressPolicy to apply.
   * @param egressFrom egressFrom or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1EgressPolicy setEgressFrom(GoogleIdentityAccesscontextmanagerV1EgressFrom egressFrom) {
    this.egressFrom = egressFrom;
    return this;
  }

  /**
   * Defines the conditions on the ApiOperation and destination resources that cause this
   * EgressPolicy to apply.
   * @return value or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1EgressTo getEgressTo() {
    return egressTo;
  }

  /**
   * Defines the conditions on the ApiOperation and destination resources that cause this
   * EgressPolicy to apply.
   * @param egressTo egressTo or {@code null} for none
   */
  public GoogleIdentityAccesscontextmanagerV1EgressPolicy setEgressTo(GoogleIdentityAccesscontextmanagerV1EgressTo egressTo) {
    this.egressTo = egressTo;
    return this;
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1EgressPolicy set(String fieldName, Object value) {
    return (GoogleIdentityAccesscontextmanagerV1EgressPolicy) super.set(fieldName, value);
  }

  @Override
  public GoogleIdentityAccesscontextmanagerV1EgressPolicy clone() {
    return (GoogleIdentityAccesscontextmanagerV1EgressPolicy) super.clone();
  }

}
