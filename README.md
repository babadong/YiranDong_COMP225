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
I edited the main.xml so that the background is set to be the cover of the album. Shown as below:
android:background="@drawable/okcomputer"

Also I added two buttons to the original four and reset the labels of all six of them. Shown as below:

<Button
      android:id="@+id/playlist_button"
      android:layout_width="fill_parent"
      android:layout_height="wrap_content"
      android:text="@string/playlist_label" />
   <Button
      android:id="@+id/picture_button"
      android:layout_width="fill_parent"
      android:layout_height="wrap_content"
      android:text="@string/picture_label" />
   <Button
      android:id="@+id/video_button"
      android:layout_width="fill_parent"
      android:layout_height="wrap_content"
      android:text="@string/video_label" />    
   <Button
      android:id="@+id/about_button"
      android:layout_width="fill_parent"
      android:layout_height="wrap_content"
      android:text="@string/about_label" />
   <Button
      android:id="@+id/search_button"
      android:layout_width="fill_parent"
      android:layout_height="wrap_content"
      android:text="@string/search_label" /> 
   <Button
      android:id="@+id/exit_button"
      android:layout_width="fill_parent"
      android:layout_height="wrap_content"
      android:text="@string/exit_label" />


Oppa Gangnam Style
---------------------------