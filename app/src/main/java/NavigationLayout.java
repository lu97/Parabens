import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.parabens.R;

public class NavigationLayout extends RelativeLayout
    {
        public NavigationLayout(Context context, RelativeLayout parent)
        {
            super(context);
            initView(context,parent);
        }

        public void initView(final Context context,RelativeLayout parent)
        {
            final View view = LayoutInflater.from(context).inflate(R.layout.variants_list,parent,true);

            ImageView closeMenu = view.findViewById(R.id.closeMenu);
            closeMenu.setOnClickListener(new ImageView.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((TextView)  view.findViewById(R.id.test)).setText("Проверочный текст");
                }
            });

        }
    }
