package com.example.correos;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	private Button Enviar;
	private EditText User;
	private EditText Pass;
	String user="root";
	String pass="12345";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		             
		this.Enviar = (Button) findViewById(R.id.btEntrar);
		this.User =  (EditText) findViewById(R.id.tbUsuario);
		this.Pass = (EditText) findViewById(R.id.tbPass);
	}

	public void btEnviar(View v)
    {
		 Intent intencion = new Intent(this, Correo.class);
	        startActivity(intencion);
    }
	
	public void btEnviarOnClick(View v)
	{
		if(User.getText().toString().equals(user) && Pass.getText().toString().equals(pass)){
			btEnviar(v);
		
			System.out.println(User.getText() + "	" + Pass.getText());
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
