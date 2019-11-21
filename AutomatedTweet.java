package tweet;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class AutomatedTweet {

	static String consumerKeyStr = "UO4YxwZ2qGBKDUm9vmk1kNutv";
	static String consumerSecretStr = "gZO3Y3MGnVFj7UYr9brvIdscuwtJVRVy0Efw8Wq14xWKSBGd0i";
	static String accessTokenStr = "1070272242775453697-x0B4IYSFUiodAGhNjQiC8cADMkTrRK";
	static String accessTokenSecretStr = "0dMRZvTrwZI8CF0nK4LwDj7JEVAcRA3KbJsjLw6IKgdos";

	public static void main(String[] args) throws TwitterException {

		try {
			Twitter twitter = new TwitterFactory().getInstance();

			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			AccessToken accessToken = new AccessToken(accessTokenStr,
					accessTokenSecretStr);

			twitter.setOAuthAccessToken(accessToken);

			twitter.updateStatus("Yo-ho-ho");

			System.out.println("Successfully updated the status in Twitter.");
		} catch (TwitterException te) {
			te.printStackTrace();
		}
	}
	

}

