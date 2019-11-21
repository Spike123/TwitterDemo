package tweet;

import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class AnswerToTweet {
	
	static String consumerKeyStr = "UO4YxwZ2qGBKDUm9vmk1kNutv";
	static String consumerSecretStr = "gZO3Y3MGnVFj7UYr9brvIdscuwtJVRVy0Efw8Wq14xWKSBGd0i";
	static String accessTokenStr = "1070272242775453697-x0B4IYSFUiodAGhNjQiC8cADMkTrRK";
	static String accessTokenSecretStr = "0dMRZvTrwZI8CF0nK4LwDj7JEVAcRA3KbJsjLw6IKgdos";
	

	public static String reply(String tweetId, String messgae ) throws TwitterException {
		    Twitter twitter = new TwitterFactory().getInstance();
			Status status = twitter.showStatus(Long.parseLong(tweetId));
	        Status reply = twitter.updateStatus(new StatusUpdate(" @" + status.getUser().getScreenName() + " "+ messgae).inReplyToStatusId(status.getId()));
	    return Long.toString(reply.getId());
	}

public static void main(String[] args) throws TwitterException {
		
		try {
			Twitter twitter = new TwitterFactory().getInstance();
			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			AccessToken accessToken = new AccessToken(accessTokenStr,
					accessTokenSecretStr);

			twitter.setOAuthAccessToken(accessToken);

			reply("1197583918779830272","no no no");
	        System.out.println("success");
			
		} catch (TwitterException te) {
			te.printStackTrace();
		}
		
	}

}
