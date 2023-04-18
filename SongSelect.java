package aprillProject.April;
import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class SongSelect {

    @Test
    public void testPlaylist() {
        Playlists playlist = new Playlists(3);

        playlist.addSong("user1", "S1");
        playlist.addSong("user1", "S2");
        playlist.addSong("user1", "S3");
        try {
			assertEquals(Arrays.asList("S1", "S2", "S3"), playlist.getRecentlyPlayed("user1"));
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("The element with s1 is not Played in the application","fail");
		}

        	try {
				playlist.addSong("user1", "S4");
				assertEquals(Arrays.asList("S2", "S3", "S4"), playlist.getRecentlyPlayed("user1"));
			} catch (ValueException e) {
				// TODO Auto-generated catch block
				reportStep("The element with s2 is not played in the application","fail");
			}

			try {
				playlist.addSong("user1", "S2");
				assertEquals(Arrays.asList("S3", "S4", "S2"), playlist.getRecentlyPlayed("user1"));
			} catch (ValueException e) {
				// TODO Auto-generated catch block
				reportStep("The element with s3 is not played in the application","fail");
			}

			try {
				playlist.addSong("user1", "S1");
				assertEquals(Arrays.asList("S4", "S2", "S1"), playlist.getRecentlyPlayed("user1"));
			} catch (ValueException e) {
				// TODO Auto-generated catch block
				reportStep("The element with s4 is not played in the application","fail");
			}

			try {
				playlist.addSong("user2", "S1");
				assertEquals(Arrays.asList("S1"), playlist.getRecentlyPlayed("user2"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				playlist.addSong("user2", "S2");
				assertEquals(Arrays.asList("S1", "S2"), playlist.getRecentlyPlayed("user2"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
    }

	private void reportStep(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
}