package abc.com.paydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterActivity extends AppCompatActivity {
    @BindView(R.id.btn_show)
    Button btnShow;
    @BindView(R.id.tv_name)
    TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_show)
    public void showName(){
        Toast.makeText(this, "Butter Knife", Toast.LENGTH_LONG).show();
        tvName.setText("Do you want to have butter?");
    }
}
