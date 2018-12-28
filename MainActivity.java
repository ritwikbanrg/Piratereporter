package kitt16053886.ac.in.piratereporter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    private static int splashtimeout= 6500;

    EditText ename;
    EditText edesigntion;
    EditText ecug;
    EditText erailwayphone;
    Button eadd;
    Spinner eproblem;
    EditText ecallnum;

    DatabaseReference emp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        emp= FirebaseDatabase.getInstance().getReference("Complaint list");
        ename= findViewById(R.id.name);
        edesigntion= findViewById(R.id.designation);
        ecallnum=findViewById(R.id.phonenum);
        ecug=findViewById(R.id.cug);
        eproblem=(Spinner) findViewById(R.id.spinner2);
        erailwayphone=findViewById(R.id.railwayphone);
        eadd=findViewById(R.id.add);
        eadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String names= ename.getText().toString().trim();
                String designations= edesigntion.getText().toString().trim();
                String cugs= ecug.getText().toString().trim();
                String probs=eproblem.getSelectedItem().toString();
                String railwayphones= erailwayphone.getText().toString().trim();
                String  id= emp.push().getKey();
                String num= ecallnum.getText().toString().trim();
                Employee o=new Employee(id, names,designations,cugs,railwayphones,probs,num);
                TextView complainid=(TextView) findViewById(R.id.textView5);
                emp.child(id).setValue(o);
                complainid.setText("Complain id:"+id);
            }
        });
    }
}
