/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import java.util.UUID;
import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The common Data Lake Analytics job information properties.
 */
public class JobInformationBasic {
    /**
     * the job's unique identifier (a GUID).
     */
    @JsonProperty(value = "jobId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID jobId;

    /**
     * the friendly name of the job.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * the job type of the current job (Hive or USql). Possible values include:
     * 'USql', 'Hive'.
     */
    @JsonProperty(value = "type", required = true)
    private JobType type;

    /**
     * the user or account that submitted the job.
     */
    @JsonProperty(value = "submitter", access = JsonProperty.Access.WRITE_ONLY)
    private String submitter;

    /**
     * the degree of parallelism used for this job.
     */
    @JsonProperty(value = "degreeOfParallelism", access = JsonProperty.Access.WRITE_ONLY)
    private Integer degreeOfParallelism;

    /**
     * the degree of parallelism in percentage used for this job.
     */
    @JsonProperty(value = "degreeOfParallelismPercent", access = JsonProperty.Access.WRITE_ONLY)
    private Double degreeOfParallelismPercent;

    /**
     * the priority value for the current job. Lower numbers have a higher
     * priority. By default, a job has a priority of 1000. This must be greater
     * than 0.
     */
    @JsonProperty(value = "priority", access = JsonProperty.Access.WRITE_ONLY)
    private Integer priority;

    /**
     * the time the job was submitted to the service.
     */
    @JsonProperty(value = "submitTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime submitTime;

    /**
     * the start time of the job.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * the completion time of the job.
     */
    @JsonProperty(value = "endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * the job state. When the job is in the Ended state, refer to Result and
     * ErrorMessage for details. Possible values include: 'Accepted',
     * 'Compiling', 'Ended', 'New', 'Queued', 'Running', 'Scheduling',
     * 'Starting', 'Paused', 'WaitingForCapacity'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private JobState state;

    /**
     * the result of job execution or the current result of the running job.
     * Possible values include: 'None', 'Succeeded', 'Cancelled', 'Failed'.
     */
    @JsonProperty(value = "result", access = JsonProperty.Access.WRITE_ONLY)
    private JobResult result;

    /**
     * the log folder path to use in the following format:
     * adl://&lt;accountName&gt;.azuredatalakestore.net/system/jobservice/jobs/Usql/2016/03/13/17/18/5fe51957-93bc-4de0-8ddc-c5a4753b068b/logs/.
     */
    @JsonProperty(value = "logFolder", access = JsonProperty.Access.WRITE_ONLY)
    private String logFolder;

    /**
     * the list of log file name patterns to find in the logFolder. '*' is the
     * only matching character allowed. Example format: jobExecution*.log or
     * *mylog*.txt.
     */
    @JsonProperty(value = "logFilePatterns", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> logFilePatterns;

    /**
     * the recurring job relationship information properties.
     */
    @JsonProperty(value = "related")
    private JobRelationshipProperties related;

    /**
     * Get the job's unique identifier (a GUID).
     *
     * @return the jobId value
     */
    public UUID jobId() {
        return this.jobId;
    }

    /**
     * Get the friendly name of the job.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the friendly name of the job.
     *
     * @param name the name value to set
     * @return the JobInformationBasic object itself.
     */
    public JobInformationBasic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the job type of the current job (Hive or USql). Possible values include: 'USql', 'Hive'.
     *
     * @return the type value
     */
    public JobType type() {
        return this.type;
    }

    /**
     * Set the job type of the current job (Hive or USql). Possible values include: 'USql', 'Hive'.
     *
     * @param type the type value to set
     * @return the JobInformationBasic object itself.
     */
    public JobInformationBasic withType(JobType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the user or account that submitted the job.
     *
     * @return the submitter value
     */
    public String submitter() {
        return this.submitter;
    }

    /**
     * Get the degree of parallelism used for this job.
     *
     * @return the degreeOfParallelism value
     */
    public Integer degreeOfParallelism() {
        return this.degreeOfParallelism;
    }

    /**
     * Get the degree of parallelism in percentage used for this job.
     *
     * @return the degreeOfParallelismPercent value
     */
    public Double degreeOfParallelismPercent() {
        return this.degreeOfParallelismPercent;
    }

    /**
     * Get the priority value for the current job. Lower numbers have a higher priority. By default, a job has a priority of 1000. This must be greater than 0.
     *
     * @return the priority value
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Get the time the job was submitted to the service.
     *
     * @return the submitTime value
     */
    public DateTime submitTime() {
        return this.submitTime;
    }

    /**
     * Get the start time of the job.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the completion time of the job.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the job state. When the job is in the Ended state, refer to Result and ErrorMessage for details. Possible values include: 'Accepted', 'Compiling', 'Ended', 'New', 'Queued', 'Running', 'Scheduling', 'Starting', 'Paused', 'WaitingForCapacity'.
     *
     * @return the state value
     */
    public JobState state() {
        return this.state;
    }

    /**
     * Get the result of job execution or the current result of the running job. Possible values include: 'None', 'Succeeded', 'Cancelled', 'Failed'.
     *
     * @return the result value
     */
    public JobResult result() {
        return this.result;
    }

    /**
     * Get the log folder path to use in the following format: adl://&lt;accountName&gt;.azuredatalakestore.net/system/jobservice/jobs/Usql/2016/03/13/17/18/5fe51957-93bc-4de0-8ddc-c5a4753b068b/logs/.
     *
     * @return the logFolder value
     */
    public String logFolder() {
        return this.logFolder;
    }

    /**
     * Get the list of log file name patterns to find in the logFolder. '*' is the only matching character allowed. Example format: jobExecution*.log or *mylog*.txt.
     *
     * @return the logFilePatterns value
     */
    public List<String> logFilePatterns() {
        return this.logFilePatterns;
    }

    /**
     * Get the recurring job relationship information properties.
     *
     * @return the related value
     */
    public JobRelationshipProperties related() {
        return this.related;
    }

    /**
     * Set the recurring job relationship information properties.
     *
     * @param related the related value to set
     * @return the JobInformationBasic object itself.
     */
    public JobInformationBasic withRelated(JobRelationshipProperties related) {
        this.related = related;
        return this;
    }

}
