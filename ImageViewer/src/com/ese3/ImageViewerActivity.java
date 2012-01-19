package com.ese3;

import com.ese3.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewerActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Intent intent = getIntent();
		String action = intent.getAction();

		ImageView image = (ImageView) findViewById(R.id.imageView1);
		//image.setImageURI((Uri) getIntent().getExtras().get(Intent.EXTRA_STREAM));
		
		/* Se viene effettuata l'azione di send carica l'immagine al posto di quella iniziale*/
		if (Intent.ACTION_SEND.equals(action)) {
			image.setImageURI((Uri) intent.getExtras().get(
					Intent.EXTRA_STREAM));
		}
	}
}