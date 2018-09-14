package onewalletui.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import sdk.android.onechatui.R;
import oneapp.onechat.oneandroid.onewallet.util.Fonts;

/**
 * @author John L. Jegutanis
 */
public class HeaderWithFontIcon extends LinearLayout {
    private final TextView fontIconView;
    private final TextView messageView;

    public HeaderWithFontIcon(Context context) {
        super(context);

        LayoutInflater.from(context).inflate(R.layout.header_with_font_icon, this, true);

        messageView = (TextView) findViewById(R.id.message);
        fontIconView = (TextView) findViewById(R.id.font_icon);
        Fonts.setTypeface(fontIconView, Fonts.Font.ONEAPP_FONT_ICONS);
    }

    public void setFontIcon(int resid) {
        fontIconView.setText(resid);
    }

    public void setMessage(int resid) {
        messageView.setText(resid);
    }
}
