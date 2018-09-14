package onemessageui.community;

import android.app.Activity;
import android.net.Uri;
import android.widget.ImageView;

import com.lzy.imagepicker.loader.ImageLoader;

import java.io.File;

import onewalletui.util.ImageUtils;


/**
 * Created by 何帅 on 2018/5/7.
 */

public class PicassoImageLoader implements ImageLoader {

    @Override
    public void displayImage(Activity activity, String path, ImageView imageView, int width, int height) {
        ImageUtils.displaySimpleNetImage(activity, Uri.fromFile(new File(path)).toString(), imageView);
    }

    @Override
    public void displayImagePreview(Activity activity, String path, ImageView imageView, int width, int height) {
        ImageUtils.displaySimpleNetImage(activity, Uri.fromFile(new File(path)).toString(), imageView);

//        Picasso.with(activity)//
//                .load(Uri.fromFile(new File(path)))//
//                .placeholder(R.mipmap.default_image)//
//                .error(R.mipmap.default_image)//
//                .resize(width, height)//
//                .centerInside()//
//                .memoryPolicy(MemoryPolicy.NO_CACHE, MemoryPolicy.NO_STORE)//
//                .into(imageView);
    }

    @Override
    public void clearMemoryCache() {
        //这里是清除缓存的方法,根据需要自己实现
    }
}