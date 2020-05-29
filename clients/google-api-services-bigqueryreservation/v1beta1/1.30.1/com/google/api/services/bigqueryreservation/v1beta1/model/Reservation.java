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

package com.google.api.services.bigqueryreservation.v1beta1.model;

/**
 * A reservation is a mechanism used to guarantee slots to users.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery Reservation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Reservation extends com.google.api.client.json.GenericJson {

  /**
   * If false, any query using this reservation will use idle slots from other reservations within
   * the same admin project. If true, a query using this reservation will execute with the slot
   * capacity specified above at most.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ignoreIdleSlots;

  /**
   * The resource name of the reservation, e.g., `projects/locations/reservations/team1-prod`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Minimum slots available to this reservation. A slot is a unit of computational power in
   * BigQuery, and serves as the unit of parallelism.
   *
   * Queries using this reservation might use more slots during runtime if ignore_idle_slots is set
   * to false.
   *
   * If the new reservation's slot capacity exceed the parent's slot capacity or if total slot
   * capacity of the new reservation and its siblings exceeds the parent's slot capacity, the
   * request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long slotCapacity;

  /**
   * If false, any query using this reservation will use idle slots from other reservations within
   * the same admin project. If true, a query using this reservation will execute with the slot
   * capacity specified above at most.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIgnoreIdleSlots() {
    return ignoreIdleSlots;
  }

  /**
   * If false, any query using this reservation will use idle slots from other reservations within
   * the same admin project. If true, a query using this reservation will execute with the slot
   * capacity specified above at most.
   * @param ignoreIdleSlots ignoreIdleSlots or {@code null} for none
   */
  public Reservation setIgnoreIdleSlots(java.lang.Boolean ignoreIdleSlots) {
    this.ignoreIdleSlots = ignoreIdleSlots;
    return this;
  }

  /**
   * The resource name of the reservation, e.g., `projects/locations/reservations/team1-prod`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the reservation, e.g., `projects/locations/reservations/team1-prod`.
   * @param name name or {@code null} for none
   */
  public Reservation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Minimum slots available to this reservation. A slot is a unit of computational power in
   * BigQuery, and serves as the unit of parallelism.
   *
   * Queries using this reservation might use more slots during runtime if ignore_idle_slots is set
   * to false.
   *
   * If the new reservation's slot capacity exceed the parent's slot capacity or if total slot
   * capacity of the new reservation and its siblings exceeds the parent's slot capacity, the
   * request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSlotCapacity() {
    return slotCapacity;
  }

  /**
   * Minimum slots available to this reservation. A slot is a unit of computational power in
   * BigQuery, and serves as the unit of parallelism.
   *
   * Queries using this reservation might use more slots during runtime if ignore_idle_slots is set
   * to false.
   *
   * If the new reservation's slot capacity exceed the parent's slot capacity or if total slot
   * capacity of the new reservation and its siblings exceeds the parent's slot capacity, the
   * request will fail with `google.rpc.Code.RESOURCE_EXHAUSTED`.
   * @param slotCapacity slotCapacity or {@code null} for none
   */
  public Reservation setSlotCapacity(java.lang.Long slotCapacity) {
    this.slotCapacity = slotCapacity;
    return this;
  }

  @Override
  public Reservation set(String fieldName, Object value) {
    return (Reservation) super.set(fieldName, value);
  }

  @Override
  public Reservation clone() {
    return (Reservation) super.clone();
  }

}
