YiranDong_COMP225
=================

Introduction
---------------------------

Nowadays some record companys intend to sell album pakages as apps on the phones that enable audiences to not only listen
to tracks but also store up artist pictures and view videos such as music videos, interviews and features. Therefore I was
trying to create a simple album app based on the framework of Sudoku. 

Structure
----------------------------
I kept the basic contentview of the main page, but modified some details. 
I edited the main.xml so that the background is set to be the cover of the album. Shown as: 
android:background="@drawable/okcomputer"

Also I added two buttons to the original four and reset the labels of all six of them. One of them looks like this:

<Button
android:id="@+id/playlist_button"
...>
I updated the strings.xml also to define strings such as playlist_label 
and playlist_title. 

There are "Playlist" "Pictures" "Videos" "About" "Search" "Exit" buttons listed on the main page right now.
When the user presses the "Playlist" button, an array should appear, list all the tracks on the album (in this case 11 
tracks in total) and start to play the track on which the user choose. 
When the user presses the "Pictures" button, a new content view should appear, list thumbnails and transfer the thumbnail
on which the user choose to the original picture. 
When the user presses the "Videos" button, an array should appear, list three categories "Music Video" "Interview" and 
"Feature", and start to play the video on which the user choose.
When the user presses the "About" button, a scrollview should appear and display the text introducing this album.
When the user presses the "Search" button, a browser should appear, allow the user to type in keywords and list out
whatever (can be tracks, pictures or videos) fit the keywords. 

By far I only make "Videos" and "About" buttons work. To make "About" work is simple. I just kept the original About.java
and About.xml in res, and updated about_text in strings.xml to be the text introducing the album.

To make "Videos" work, I firstly define a Video class that opens a new contentview and starts a video. Then I referred
to this class in the main activity Wocao.java. Shown as below:

private void openNewVideoDialog() {
		      new AlertDialog.Builder(this)
		           .setTitle(R.string.video_title)
		           .setItems(R.array.videolist,
		            new DialogInterface.OnClickListener() {
		               public void onClick(DialogInterface dialoginterface,
		                     int i) {
		                  startVideo(i);
		               }
		            })
		           .show();
		   }

		   /** Start a new game with the given difficulty level */
		   private void startVideo(int i) {
		      Intent intent = new Intent(this, Video.Play(i));
		      startActivity(intent);
		   }

Therefore according to the following command, whenever the user clicks on the video button, a menu will appear and 
allow the user to choose whichever he wants to view. 

case R.id.video_button:
openNewVideoDialog();
break;

--------------------------------------------
By far I'm still working on other functions. 


