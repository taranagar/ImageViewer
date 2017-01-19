package compsci290.edu.duke.imageviewer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter (Context c) {
        mContext = c;
    }

    public Integer[] mThumbs =
            { R.drawable.pic0_thumb, R.drawable.pic1_thumb, R.drawable.pic2_thumb,
                    R.drawable.pic3_thumb, R.drawable.pic4_thumb, R.drawable.pic5_thumb,
                    R.drawable.pic6_thumb, R.drawable.pic7_thumb, R.drawable.pic8_thumb,
                    R.drawable.pic9_thumb, R.drawable.pic10_thumb,R.drawable.pic11_thumb,
                    R.drawable.pic12_thumb,R.drawable.pic13_thumb,R.drawable.pic14_thumb,
                    R.drawable.pic15_thumb,R.drawable.pic16_thumb,R.drawable.pic17_thumb,
                    R.drawable.pic18_thumb, R.drawable.pic19_thumb
            };

    @Override
    public int getCount () {
        return mThumbs.length;
    }

    @Override
    public Object getItem (int position) {
        return mThumbs[position];
    }


    @Override
    public long getItemId (int position) {
        return position;
    }


    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView (mContext);
            imageView.setScaleType (ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams (new GridView.LayoutParams(220, 220));
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource (mThumbs[position]);

        return imageView;
    }
}
