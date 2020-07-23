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

package com.google.api.services.osconfig.v1beta.model;

/**
 * A high level representation of a patch job that is either in progress or has completed.
 *
 * Instance details are not included in the job. To paginate through instance details, use
 * `ListPatchJobInstanceDetails`.
 *
 * For more information about patch jobs, see [Creating patch
 * jobs](https://cloud.google.com/compute/docs/os-patch-management/create-patch-job).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PatchJob extends com.google.api.client.json.GenericJson {

  /**
   * Time this patch job was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Description of the patch job. Length of the description is limited to 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Display name for this patch job. This is not a unique identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * If this patch job is a dry run, the agent reports that it has finished without running any
   * updates on the VM instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dryRun;

  /**
   * Duration of the patch job. After the duration ends, the patch job times out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String duration;

  /**
   * If this patch job failed, this message provides information about the failure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMessage;

  /**
   * Summary of instance details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PatchJobInstanceDetailsSummary instanceDetailsSummary;

  /**
   * Instances to patch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PatchInstanceFilter instanceFilter;

  /**
   * Unique identifier for this patch job in the form `projects/patchJobs`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Patch configuration being applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PatchConfig patchConfig;

  /**
   * Output only. Name of the patch deployment that created this patch job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String patchDeployment;

  /**
   * Reflects the overall progress of the patch job in the range of 0.0 being no progress to 100.0
   * being complete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double percentComplete;

  /**
   * Rollout strategy being applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PatchRollout rollout;

  /**
   * The current state of the PatchJob.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Last time this patch job was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Time this patch job was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Time this patch job was created.
   * @param createTime createTime or {@code null} for none
   */
  public PatchJob setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Description of the patch job. Length of the description is limited to 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the patch job. Length of the description is limited to 1024 characters.
   * @param description description or {@code null} for none
   */
  public PatchJob setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Display name for this patch job. This is not a unique identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name for this patch job. This is not a unique identifier.
   * @param displayName displayName or {@code null} for none
   */
  public PatchJob setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * If this patch job is a dry run, the agent reports that it has finished without running any
   * updates on the VM instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDryRun() {
    return dryRun;
  }

  /**
   * If this patch job is a dry run, the agent reports that it has finished without running any
   * updates on the VM instance.
   * @param dryRun dryRun or {@code null} for none
   */
  public PatchJob setDryRun(java.lang.Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Duration of the patch job. After the duration ends, the patch job times out.
   * @return value or {@code null} for none
   */
  public String getDuration() {
    return duration;
  }

  /**
   * Duration of the patch job. After the duration ends, the patch job times out.
   * @param duration duration or {@code null} for none
   */
  public PatchJob setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  /**
   * If this patch job failed, this message provides information about the failure.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * If this patch job failed, this message provides information about the failure.
   * @param errorMessage errorMessage or {@code null} for none
   */
  public PatchJob setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Summary of instance details.
   * @return value or {@code null} for none
   */
  public PatchJobInstanceDetailsSummary getInstanceDetailsSummary() {
    return instanceDetailsSummary;
  }

  /**
   * Summary of instance details.
   * @param instanceDetailsSummary instanceDetailsSummary or {@code null} for none
   */
  public PatchJob setInstanceDetailsSummary(PatchJobInstanceDetailsSummary instanceDetailsSummary) {
    this.instanceDetailsSummary = instanceDetailsSummary;
    return this;
  }

  /**
   * Instances to patch.
   * @return value or {@code null} for none
   */
  public PatchInstanceFilter getInstanceFilter() {
    return instanceFilter;
  }

  /**
   * Instances to patch.
   * @param instanceFilter instanceFilter or {@code null} for none
   */
  public PatchJob setInstanceFilter(PatchInstanceFilter instanceFilter) {
    this.instanceFilter = instanceFilter;
    return this;
  }

  /**
   * Unique identifier for this patch job in the form `projects/patchJobs`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Unique identifier for this patch job in the form `projects/patchJobs`
   * @param name name or {@code null} for none
   */
  public PatchJob setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Patch configuration being applied.
   * @return value or {@code null} for none
   */
  public PatchConfig getPatchConfig() {
    return patchConfig;
  }

  /**
   * Patch configuration being applied.
   * @param patchConfig patchConfig or {@code null} for none
   */
  public PatchJob setPatchConfig(PatchConfig patchConfig) {
    this.patchConfig = patchConfig;
    return this;
  }

  /**
   * Output only. Name of the patch deployment that created this patch job.
   * @return value or {@code null} for none
   */
  public java.lang.String getPatchDeployment() {
    return patchDeployment;
  }

  /**
   * Output only. Name of the patch deployment that created this patch job.
   * @param patchDeployment patchDeployment or {@code null} for none
   */
  public PatchJob setPatchDeployment(java.lang.String patchDeployment) {
    this.patchDeployment = patchDeployment;
    return this;
  }

  /**
   * Reflects the overall progress of the patch job in the range of 0.0 being no progress to 100.0
   * being complete.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPercentComplete() {
    return percentComplete;
  }

  /**
   * Reflects the overall progress of the patch job in the range of 0.0 being no progress to 100.0
   * being complete.
   * @param percentComplete percentComplete or {@code null} for none
   */
  public PatchJob setPercentComplete(java.lang.Double percentComplete) {
    this.percentComplete = percentComplete;
    return this;
  }

  /**
   * Rollout strategy being applied.
   * @return value or {@code null} for none
   */
  public PatchRollout getRollout() {
    return rollout;
  }

  /**
   * Rollout strategy being applied.
   * @param rollout rollout or {@code null} for none
   */
  public PatchJob setRollout(PatchRollout rollout) {
    this.rollout = rollout;
    return this;
  }

  /**
   * The current state of the PatchJob.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The current state of the PatchJob.
   * @param state state or {@code null} for none
   */
  public PatchJob setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Last time this patch job was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Last time this patch job was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public PatchJob setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public PatchJob set(String fieldName, Object value) {
    return (PatchJob) super.set(fieldName, value);
  }

  @Override
  public PatchJob clone() {
    return (PatchJob) super.clone();
  }

}
