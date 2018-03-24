package com.example.surejahit.career_guidance_app;

/**
 * Created by Mit Patel on 10-Mar-18.
 */
 import android.content.Context;
 import android.content.Intent;
 import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;

 import com.example.surejahit.career_guidance_app.jobpackage.ArchiActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.AutoActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.CAActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.CivilActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.DentalActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.ECActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.ElectActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.ItActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.MbaActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.MbbsActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.MechActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.PlasticActivity;
 import com.example.surejahit.career_guidance_app.jobpackage.TexttileActivity;

 import java.util.ArrayList;

/**
 * Created by Oclemy on 7/2/2016 for ProgrammingWizards Channel and http://www.camposha.com.
 */
public class CustomAdapter extends BaseAdapter {
    Context c;
    ArrayList<Spacecraft> spacecrafts;
    //private Context mContext;

    public CustomAdapter(Context c, ArrayList<Spacecraft> spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;
    }

    @Override
    public int getCount() {
        return spacecrafts.size();
    }

    @Override
    public Object getItem(int i) {
        return spacecrafts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view= LayoutInflater.from(c).inflate(R.layout.model,viewGroup,false);
        }

        final Spacecraft s= (Spacecraft) this.getItem(i);

        ImageView img= (ImageView) view.findViewById(R.id.spacecraftImg);
        TextView nameTxt= (TextView) view.findViewById(R.id.nameTxt);

        //BIND
        nameTxt.setText(s.getName());
        img.setImageResource(s.getImage());


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (i){
                    case 0:
                        Intent intent0=new Intent(c,ArchiActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 =new Intent(c,AutoActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 =new Intent(c,CAActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 =new Intent(c,CivilActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 =new Intent(c,DentalActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 =new Intent(c,ECActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 =new Intent(c,ElectActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 =new Intent(c,ItActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 =new Intent(c,MbaActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 =new Intent(c,MbbsActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 =new Intent(c,MechActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 =new Intent(c,PlasticActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 =new Intent(c,TexttileActivity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        c.startActivity(intent12);
                        break;
                     default:
                         break;

                }
                Toast.makeText(c, s.getName(), Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }
}








