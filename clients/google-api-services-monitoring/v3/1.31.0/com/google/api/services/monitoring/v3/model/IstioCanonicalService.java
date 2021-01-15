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
 * Canonical service scoped to an Istio mesh. Anthos clusters running ASM >= 1.6.8 will have their
 * services ingested as this type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IstioCanonicalService extends com.google.api.client.json.GenericJson {

  /**
   * The name of the canonical service underlying this service. Corresponds to the
   * destination_canonical_service_name metric label in label in Istio metrics
   * (https://cloud.google.com/monitoring/api/metrics_istio).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String canonicalService;

  /**
   * The namespace of the canonical service underlying this service. Corresponds to the
   * destination_canonical_service_namespace metric label in Istio metrics
   * (https://cloud.google.com/monitoring/api/metrics_istio).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String canonicalServiceNamespace;

  /**
   * Identifier for the Istio mesh in which this canonical service is defined. Corresponds to the
   * mesh_uid metric label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String meshUid;

  /**
   * The name of the canonical service underlying this service. Corresponds to the
   * destination_canonical_service_name metric label in label in Istio metrics
   * (https://cloud.google.com/monitoring/api/metrics_istio).
   * @return value or {@code null} for none
   */
  public java.lang.String getCanonicalService() {
    return canonicalService;
  }

  /**
   * The name of the canonical service underlying this service. Corresponds to the
   * destination_canonical_service_name metric label in label in Istio metrics
   * (https://cloud.google.com/monitoring/api/metrics_istio).
   * @param canonicalService canonicalService or {@code null} for none
   */
  public IstioCanonicalService setCanonicalService(java.lang.String canonicalService) {
    this.canonicalService = canonicalService;
    return this;
  }

  /**
   * The namespace of the canonical service underlying this service. Corresponds to the
   * destination_canonical_service_namespace metric label in Istio metrics
   * (https://cloud.google.com/monitoring/api/metrics_istio).
   * @return value or {@code null} for none
   */
  public java.lang.String getCanonicalServiceNamespace() {
    return canonicalServiceNamespace;
  }

  /**
   * The namespace of the canonical service underlying this service. Corresponds to the
   * destination_canonical_service_namespace metric label in Istio metrics
   * (https://cloud.google.com/monitoring/api/metrics_istio).
   * @param canonicalServiceNamespace canonicalServiceNamespace or {@code null} for none
   */
  public IstioCanonicalService setCanonicalServiceNamespace(java.lang.String canonicalServiceNamespace) {
    this.canonicalServiceNamespace = canonicalServiceNamespace;
    return this;
  }

  /**
   * Identifier for the Istio mesh in which this canonical service is defined. Corresponds to the
   * mesh_uid metric label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
   * @return value or {@code null} for none
   */
  public java.lang.String getMeshUid() {
    return meshUid;
  }

  /**
   * Identifier for the Istio mesh in which this canonical service is defined. Corresponds to the
   * mesh_uid metric label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
   * @param meshUid meshUid or {@code null} for none
   */
  public IstioCanonicalService setMeshUid(java.lang.String meshUid) {
    this.meshUid = meshUid;
    return this;
  }

  @Override
  public IstioCanonicalService set(String fieldName, Object value) {
    return (IstioCanonicalService) super.set(fieldName, value);
  }

  @Override
  public IstioCanonicalService clone() {
    return (IstioCanonicalService) super.clone();
  }

}
