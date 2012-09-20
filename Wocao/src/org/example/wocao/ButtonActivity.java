package org.example.wocao;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends Activity {

  
    
	private String mImageButtonMessageTemplate;
	private String mButtonMessageTemplate;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);
		mImageButtonMessageTemplate = getString(R.string.image_button_message_template);
		mButtonMessageTemplate = getString(R.string.button_message_template);
				}
	
	public void showButtonText(View clickedButton) { 
		Button button = (Button)clickedButton;
		CharSequence text = button.getText();
		String message =
		String.format(mButtonMessageTemplate, text);
		showToast(message);
		}
	
	public void showImageButton1Info(View clickedImageButton) {
		showImageButtonInfo(R.string.image_button_1_image);
		}
	private void showImageButtonInfo(int imageId) {
		String image = getString(imageId);
		String message =
		String.format(mImageButtonMessageTemplate, image);
		showToast(message);
		}
    
    private void showToast(String text) {
		Toast.makeText(this, text, Toast.LENGTH_LONG).show();
		}
}
