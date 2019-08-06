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

package com.google.api.services.jobs.v2.model;

/**
 * Input only.
 *
 * Geographic region of the search.
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
public final class LocationFilter extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The distance_in_miles is applied when the location being searched for is identified
   * as a city or smaller. When the location being searched for is a state or larger, this field is
   * ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double distanceInMiles;

  /**
   * Optional. Allows the client to return jobs without a set location, specifically, telecommuting
   * jobs (telecomuting is considered by the service as a special location. Job.allow_telecommute
   * indicates if a job permits telecommuting. If this field is true, telecommuting jobs are
   * searched, and name and lat_lng are ignored. This filter can be used by itself to search
   * exclusively for telecommuting jobs, or it can be combined with another location filter to
   * search for a combination of job locations, such as "Mountain View" or "telecommuting" jobs.
   * However, when used in combination with other location filters, telecommuting jobs can be
   * treated as less relevant than other jobs in the search response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isTelecommute;

  /**
   * Optional. The latitude and longitude of the geographic center from which to search. This field
   * is ignored if `location_name` is provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LatLng latLng;

  /**
   * Optional. The address name, such as "Mountain View" or "Bay Area".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. CLDR region code of the country/region of the address. This will be used to address
   * ambiguity of the user-input location, e.g. "Liverpool" against "Liverpool, NY, US" or
   * "Liverpool, UK".
   *
   * Set this field if all the jobs to search against are from a same region, or jobs are world-wide
   * but the job seeker is from a specific region.
   *
   * See http://cldr.unicode.org/ and
   * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details.
   * Example: "CH" for Switzerland.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Optional. The distance_in_miles is applied when the location being searched for is identified
   * as a city or smaller. When the location being searched for is a state or larger, this field is
   * ignored.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDistanceInMiles() {
    return distanceInMiles;
  }

  /**
   * Optional. The distance_in_miles is applied when the location being searched for is identified
   * as a city or smaller. When the location being searched for is a state or larger, this field is
   * ignored.
   * @param distanceInMiles distanceInMiles or {@code null} for none
   */
  public LocationFilter setDistanceInMiles(java.lang.Double distanceInMiles) {
    this.distanceInMiles = distanceInMiles;
    return this;
  }

  /**
   * Optional. Allows the client to return jobs without a set location, specifically, telecommuting
   * jobs (telecomuting is considered by the service as a special location. Job.allow_telecommute
   * indicates if a job permits telecommuting. If this field is true, telecommuting jobs are
   * searched, and name and lat_lng are ignored. This filter can be used by itself to search
   * exclusively for telecommuting jobs, or it can be combined with another location filter to
   * search for a combination of job locations, such as "Mountain View" or "telecommuting" jobs.
   * However, when used in combination with other location filters, telecommuting jobs can be
   * treated as less relevant than other jobs in the search response.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsTelecommute() {
    return isTelecommute;
  }

  /**
   * Optional. Allows the client to return jobs without a set location, specifically, telecommuting
   * jobs (telecomuting is considered by the service as a special location. Job.allow_telecommute
   * indicates if a job permits telecommuting. If this field is true, telecommuting jobs are
   * searched, and name and lat_lng are ignored. This filter can be used by itself to search
   * exclusively for telecommuting jobs, or it can be combined with another location filter to
   * search for a combination of job locations, such as "Mountain View" or "telecommuting" jobs.
   * However, when used in combination with other location filters, telecommuting jobs can be
   * treated as less relevant than other jobs in the search response.
   * @param isTelecommute isTelecommute or {@code null} for none
   */
  public LocationFilter setIsTelecommute(java.lang.Boolean isTelecommute) {
    this.isTelecommute = isTelecommute;
    return this;
  }

  /**
   * Optional. The latitude and longitude of the geographic center from which to search. This field
   * is ignored if `location_name` is provided.
   * @return value or {@code null} for none
   */
  public LatLng getLatLng() {
    return latLng;
  }

  /**
   * Optional. The latitude and longitude of the geographic center from which to search. This field
   * is ignored if `location_name` is provided.
   * @param latLng latLng or {@code null} for none
   */
  public LocationFilter setLatLng(LatLng latLng) {
    this.latLng = latLng;
    return this;
  }

  /**
   * Optional. The address name, such as "Mountain View" or "Bay Area".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Optional. The address name, such as "Mountain View" or "Bay Area".
   * @param name name or {@code null} for none
   */
  public LocationFilter setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. CLDR region code of the country/region of the address. This will be used to address
   * ambiguity of the user-input location, e.g. "Liverpool" against "Liverpool, NY, US" or
   * "Liverpool, UK".
   *
   * Set this field if all the jobs to search against are from a same region, or jobs are world-wide
   * but the job seeker is from a specific region.
   *
   * See http://cldr.unicode.org/ and
   * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details.
   * Example: "CH" for Switzerland.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * Optional. CLDR region code of the country/region of the address. This will be used to address
   * ambiguity of the user-input location, e.g. "Liverpool" against "Liverpool, NY, US" or
   * "Liverpool, UK".
   *
   * Set this field if all the jobs to search against are from a same region, or jobs are world-wide
   * but the job seeker is from a specific region.
   *
   * See http://cldr.unicode.org/ and
   * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html for details.
   * Example: "CH" for Switzerland.
   * @param regionCode regionCode or {@code null} for none
   */
  public LocationFilter setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  @Override
  public LocationFilter set(String fieldName, Object value) {
    return (LocationFilter) super.set(fieldName, value);
  }

  @Override
  public LocationFilter clone() {
    return (LocationFilter) super.clone();
  }

}
