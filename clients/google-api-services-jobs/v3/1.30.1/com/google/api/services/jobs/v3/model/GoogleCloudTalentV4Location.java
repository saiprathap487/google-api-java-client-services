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

package com.google.api.services.jobs.v3.model;

/**
 * A resource that represents a location with full geographic information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudTalentV4Location extends com.google.api.client.json.GenericJson {

  /**
   * An object representing a latitude/longitude pair.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LatLng latLng;

  /**
   * The type of a location, which corresponds to the address lines field of
   * google.type.PostalAddress. For example, "Downtown, Atlanta, GA, USA" has a type of
   * LocationType.NEIGHBORHOOD, and "Kansas City, KS, USA" has a type of LocationType.LOCALITY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationType;

  /**
   * Postal address of the location that includes human readable information, such as postal
   * delivery and payments addresses. Given a postal address, a postal service can deliver items to
   * a premises, P.O. Box, or other delivery location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PostalAddress postalAddress;

  /**
   * Radius in miles of the job location. This value is derived from the location bounding box in
   * which a circle with the specified radius centered from google.type.LatLng covers the area
   * associated with the job location. For example, currently, "Mountain View, CA, USA" has a radius
   * of 6.17 miles.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double radiusMiles;

  /**
   * An object representing a latitude/longitude pair.
   * @return value or {@code null} for none
   */
  public LatLng getLatLng() {
    return latLng;
  }

  /**
   * An object representing a latitude/longitude pair.
   * @param latLng latLng or {@code null} for none
   */
  public GoogleCloudTalentV4Location setLatLng(LatLng latLng) {
    this.latLng = latLng;
    return this;
  }

  /**
   * The type of a location, which corresponds to the address lines field of
   * google.type.PostalAddress. For example, "Downtown, Atlanta, GA, USA" has a type of
   * LocationType.NEIGHBORHOOD, and "Kansas City, KS, USA" has a type of LocationType.LOCALITY.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationType() {
    return locationType;
  }

  /**
   * The type of a location, which corresponds to the address lines field of
   * google.type.PostalAddress. For example, "Downtown, Atlanta, GA, USA" has a type of
   * LocationType.NEIGHBORHOOD, and "Kansas City, KS, USA" has a type of LocationType.LOCALITY.
   * @param locationType locationType or {@code null} for none
   */
  public GoogleCloudTalentV4Location setLocationType(java.lang.String locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * Postal address of the location that includes human readable information, such as postal
   * delivery and payments addresses. Given a postal address, a postal service can deliver items to
   * a premises, P.O. Box, or other delivery location.
   * @return value or {@code null} for none
   */
  public PostalAddress getPostalAddress() {
    return postalAddress;
  }

  /**
   * Postal address of the location that includes human readable information, such as postal
   * delivery and payments addresses. Given a postal address, a postal service can deliver items to
   * a premises, P.O. Box, or other delivery location.
   * @param postalAddress postalAddress or {@code null} for none
   */
  public GoogleCloudTalentV4Location setPostalAddress(PostalAddress postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * Radius in miles of the job location. This value is derived from the location bounding box in
   * which a circle with the specified radius centered from google.type.LatLng covers the area
   * associated with the job location. For example, currently, "Mountain View, CA, USA" has a radius
   * of 6.17 miles.
   * @return value or {@code null} for none
   */
  public java.lang.Double getRadiusMiles() {
    return radiusMiles;
  }

  /**
   * Radius in miles of the job location. This value is derived from the location bounding box in
   * which a circle with the specified radius centered from google.type.LatLng covers the area
   * associated with the job location. For example, currently, "Mountain View, CA, USA" has a radius
   * of 6.17 miles.
   * @param radiusMiles radiusMiles or {@code null} for none
   */
  public GoogleCloudTalentV4Location setRadiusMiles(java.lang.Double radiusMiles) {
    this.radiusMiles = radiusMiles;
    return this;
  }

  @Override
  public GoogleCloudTalentV4Location set(String fieldName, Object value) {
    return (GoogleCloudTalentV4Location) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudTalentV4Location clone() {
    return (GoogleCloudTalentV4Location) super.clone();
  }

}
