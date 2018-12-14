package stashpullrequestbuilder.stashpullrequestbuilder.stash;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * If pull request is approved
 * https://docs.atlassian.com/DAC/rest/stash/3.9.2/stash-rest.html#idp2785024
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StashPullRequestParticipantsResponse {

    private String role;
    private String status;
    private Boolean approved;

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
