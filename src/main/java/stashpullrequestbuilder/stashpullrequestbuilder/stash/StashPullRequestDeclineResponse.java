package stashpullrequestbuilder.stashpullrequestbuilder.stash;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * If pull request is approved
 * https://docs.atlassian.com/DAC/rest/stash/3.9.2/stash-rest.html#idp2785024
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StashPullRequestDeclineResponse {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }
}
