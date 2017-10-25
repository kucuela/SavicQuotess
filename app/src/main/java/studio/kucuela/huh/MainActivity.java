package studio.kucuela.huh;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;




import java.io.File;
import java.io.FileOutputStream;
import java.lang.annotation.Target;

public class MainActivity extends Activity {


    private WebView mWebview ;

    /*// Get access to ImageView
    ImageView ivImage = (ImageView) findViewById(R.id.ivResult);
// Fire async request to load image
Picasso.with(context).load(imageUrl).into(ivImage);*/

    ImageView imageView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        /*Picasso.with(this)
                .load("http://xdn.tf.rs/2017/06/15/tomislav-1.jpg")
                .into(ivImage );*/














    }











    // Called when btnOpen is clicked
    public void kvaliteta (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "NEUNOSIMO POZZ?");
        startActivity(intent);


    }

    public void disciplinovan (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "OVO JE NJEMAČKA KVALITETA! \nNIJE TO ONO SRANJE ŠTO KINEZI PRAVE! \nALO BRE! \nNJEMAČKA KVALITETA! \nNIKAD MI SE NIKO NIJE ŽALIO NA ROBU!");
        startActivity(intent);
    }

    public void razguli (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "VISIO BI TI MENI NA BANDERI!");
        startActivity(intent);
    }

    public void kapija (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "OVO JE SRPSKA KUĆA!ALO! \nNEĆE MI ON OVDE KLANJATI! \nNIJE OVO DŽAMIJA! \nJEBO MAJKU SVOJU BRADATU! \nSRPSKA KUĆA,BRE!");
        startActivity(intent);
    }

    public void sc (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "ŠTO OVO MALO NE OČISTITE? \nREĆU JA BRANKU! \nOVAJ MALI TAKILO NEĆE NIŠTA DA ČISTI! \nILI NEK PLATI ŽENU 20 OJRA! \nILI KAPIJA!");
        startActivity(intent);
    }

    public void hey (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "ZAPAMTIĆEŠ SINOĆNU VEČE \nPORIJEKLO TI JEBEM \nZAPAMTIĆEŠ SRBINA \nIZ REPUBLIKE SPRSKE! \nMIRA NIJE SAMA \nNI REPA BEZ KORENA \nKOME ĆEŠ TI PIČKU LIZAT? \nLIZAT ĆEŠ TI MOJ KURAC!!!");
        startActivity(intent);
    }



    public void zatvor (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "MIRO,IMAL PIVE?");
        startActivity(intent);
    }



    public void zapamtices (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "K A P I J A!");
        startActivity(intent);
    }

    public void alo (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "ALO! \n\nA\nL\nO \n\nA L O !");
        startActivity(intent);
    }

    public void branko (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "ŠTO MI SE BRANKO NE JAVLJA?");
        startActivity(intent);
    }

    public void jasam (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "JA SAM TI SE \nZATVORA NALEŽO \nPIČKI NAJEBO \nI ŽIVOTA NAŽIVEO!");
        startActivity(intent);
    }

    public void zakljucaj (View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_TEXT, "JA SAM TI DISCIPLINOVAN!");
        startActivity(intent);
    }






        }
