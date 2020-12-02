package com.olmo.androidcalculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonEq, buttonDot, buttonRest, buttonSum, buttonDiv, buttonMult, buttonClear, buttonPlusMin, buttonClearParc;
    String result, op, aux;
    int n1, n2, n3, n4;
    int selectOp;
    Float num1, num2, numAux = 0f;
    Boolean firstNum = true;
    TextView operaciones, resultParcial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        aux = " ";
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        buttonEq = (Button) findViewById(R.id.buttonEq);
        buttonEq.setOnClickListener(this);

        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonDot.setOnClickListener(this);

        buttonRest = (Button) findViewById(R.id.buttonRest);
        buttonRest.setOnClickListener(this);

        buttonSum = (Button) findViewById(R.id.buttonSum);
        buttonSum.setOnClickListener(this);

        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(this);

        buttonMult = (Button) findViewById(R.id.buttonMult);
        buttonMult.setOnClickListener(this);

        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);

        buttonPlusMin = (Button) findViewById(R.id.buttonPlusMin);
        buttonPlusMin.setOnClickListener(this);

        buttonClearParc = (Button) findViewById(R.id.buttonClearParc);
        buttonClearParc.setOnClickListener(this);

        operaciones = (TextView) findViewById(R.id.operaciones);
        resultParcial = (TextView) findViewById(R.id.resultParcial);
    }

    public void igual() {
        firstNum = false;
        switch (selectOp) {
            /*Division*/
            case 1:
                numAux = num1 / num2;
                resultParcial.setText(numAux.toString());
                break;
            /*Multiplicacion*/
            case 2:
                numAux = num1 * num2;
                resultParcial.setText(numAux.toString());
                break;
            /*Resta*/
            case 3:
                numAux = num1 - num2;
                resultParcial.setText(numAux.toString());
                break;
            /*Suma*/
            case 4:
                numAux = num1 + num2;
                resultParcial.setText(numAux.toString());
                break;

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonDot:
                op = operaciones.getText().toString();

                if (aux.equals("")) {
                    operaciones.setText(op + "0.");
                    aux = aux.concat("0.");
                    firstNum = true;
                } else {
                    operaciones.setText(op + ".");
                    aux = aux.concat(".");


                }

                break;
            case R.id.button0:
                op = operaciones.getText().toString();
                operaciones.setText(op + "0");
                aux = aux.concat("0");
                System.out.println(aux);
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            case R.id.button1:
                op = operaciones.getText().toString();
                operaciones.setText(op + "1");
                aux = aux.concat("1");
                System.out.println(aux);
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {

                    num2 = Float.parseFloat(aux);
                    System.out.println("num2= " + num2);
                    igual();
                }

                break;
            case R.id.button2:
                op = operaciones.getText().toString();
                operaciones.setText(op + "2");
                aux = aux.concat("2");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            case R.id.button3:
                op = operaciones.getText().toString();
                operaciones.setText(op + "3");
                aux = aux.concat("3");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            case R.id.button4:
                op = operaciones.getText().toString();
                operaciones.setText(op + "4");
                aux = aux.concat("4");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            case R.id.button5:
                op = operaciones.getText().toString();
                operaciones.setText(op + "5");
                aux = aux.concat("5");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            case R.id.button6:
                op = operaciones.getText().toString();
                operaciones.setText(op + "6");
                aux = aux.concat("6");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            case R.id.button7:
                op = operaciones.getText().toString();
                operaciones.setText(op + "7");
                aux = aux.concat("7");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            case R.id.button8:
                op = operaciones.getText().toString();
                operaciones.setText(op + "8");
                aux = aux.concat("8");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            case R.id.button9:
                op = operaciones.getText().toString();
                operaciones.setText(op + "9");
                aux = aux.concat("9");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            case R.id.buttonDiv:
                selectOp = 1;
                op = operaciones.getText().toString();
                operaciones.setText(op + "/");
                aux = "";
                if (!firstNum) {
                    num1 = numAux;
                    numAux = 0f;
                } else {

                    firstNum = false;
                }


                break;
            case R.id.buttonMult:
                selectOp = 2;
                op = operaciones.getText().toString();
                operaciones.setText(op + "x");
                aux = "";
                if (!firstNum) {
                    num1 = numAux;
                    numAux = 0f;
                } else {

                    firstNum = false;
                }

                break;
            case R.id.buttonRest:
                selectOp = 3;
                op = operaciones.getText().toString();
                operaciones.setText(op + "-");
                aux = "";
                if (!firstNum) {
                    num1 = numAux;
                    numAux = 0f;
                } else {

                    firstNum = false;
                }

                break;
            case R.id.buttonSum:
                selectOp = 4;
                op = operaciones.getText().toString();
                operaciones.setText(op + "+");
                aux = "";
                if (!firstNum) {
                    
                    num1 = numAux;
                    numAux = 0f;
                } else {

                    firstNum = false;
                }
                break;

            case R.id.buttonEq:
                operaciones.setText(resultParcial.getText().toString());
                num1 = numAux;
                numAux = 0f;
                aux = "";
                resultParcial.setText("");
                firstNum = true;
                op = "";
                break;
                /* switch (selectOp) {

                    case 1:
                        num1 = num1 / num2;
                        operaciones.setText(num1.toString());
                        aux = "";
                        resultParcial.setText("");
                        firstNum = true;
                        op = "";
                        break;
                    case 2:
                        num1 = num1 * num2;
                        operaciones.setText(num1.toString());
                        aux = "";
                        resultParcial.setText("");
                        firstNum = true;
                        op = "";
                        break;
                    case 3:
                        num1 = num1 - num2;
                        operaciones.setText(num1.toString());
                        aux = "";
                        resultParcial.setText("");
                        firstNum = true;
                        op = "";
                        break;
                    case 4:
                        num1 = num1 + num2;
                        operaciones.setText(num1.toString());
                        aux = "";
                        resultParcial.setText("");
                        firstNum = true;
                        op = "";
                        break;

                }


                break;
*/
            case R.id.buttonClear:
                selectOp = 0;
                op = "";
                operaciones.setText("");
                aux = "";
                firstNum = true;
                resultParcial.setText("");
                num1 = num2 = numAux = 0f;

                break;
            case R.id.buttonClearParc:


                break;
            case R.id.buttonPlusMin:
                if (firstNum) {
                    num1 = -num1;
                    operaciones.setText(num1.toString());
                } else {

                    op = operaciones.getText().toString();
                    n1 = op.lastIndexOf("/") + 1;
                    n2 = op.lastIndexOf("*") + 1;
                    n3 = op.lastIndexOf("-") + 1;
                    n4 = op.lastIndexOf("+") + 1;
                    compare(n1,n2,n3,n4);
                    aux= op.substring(0,compare(n1,n2,n3,n4));

                    if(evNum2()){
                        aux=aux.substring(0,aux.length()-1);
                    }
                    num2 = -num2;
                    operaciones.setText(aux + num2.toString());

                    igual();

                }

                break;
        }


    }

    public int compare(int n1, int n2, int n3, int n4) {
        Integer num = n1;
        if (num.compareTo(n2) == 1 && num.compareTo(n3) == 1 && num.compareTo(n4) == 1) {
            return n1;
        }
        num = n2;
        if (num.compareTo(n1) == 1 && num.compareTo(n3) == 1 && num.compareTo(n4) == 1) {
            return n2;
        }
        num = n3;
        if (num.compareTo(n1) == 1 && num.compareTo(n2) == 1 && num.compareTo(n4) == 1) {
            return n3;
        }
        num = n4;
        if (num.compareTo(n1) == 1 && num.compareTo(n2) == 1 && num.compareTo(n3) == 1) {
            return n4;
        }

        return n1;

    }

    public Boolean evNum2(){
        if(num2<0){
            return true;
        }else
            return false;
    }

}