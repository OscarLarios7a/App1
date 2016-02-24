package myapp.example.oskrlarios.app1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    private EditText saludo;
    private Button aceptar;
    private TextView respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saludo=(EditText)findViewById(R.id.txtSaludo);
        aceptar=(Button)findViewById(R.id.btnAceptar);
        respuesta=(TextView)findViewById(R.id.txtRespuesta);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    respuesta.setText(getString(R.string.hola)+" "+String.valueOf( saludo.getText()));

            }
        });

    }
}
