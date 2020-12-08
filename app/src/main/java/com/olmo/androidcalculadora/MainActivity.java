package com.olmo.androidcalculadora;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Main Activity de la calculadora
 *
 * @author Olmo Tamargo Suárez
 * @version 1.0
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    /*Declaración de variables*/
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonEq, buttonDot, buttonRest, buttonSum, buttonDiv, buttonMult, buttonClear, buttonPlusMin, buttonClearParc;
    String op, aux;
    int n1, n2, n3, n4, coef1, coef2;
    int selectOp;
    Float num1, num2, numAux;
    Boolean firstNum, firstDot;
    TextView operaciones, resultParcial;

    Context context;
    CharSequence text;
    int duration;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Inicialización de variables
         */
        aux = " ";
        num1 = num2 = numAux = 0f;
        numAux = 0f;
        coef1 = coef2 = 1;
        firstNum = firstDot = true;
        context = getApplicationContext();
        duration = Toast.LENGTH_SHORT;


        /**
         * Botones y asignacion de listeners
         */
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


        /**TextViews*/
        operaciones = (TextView) findViewById(R.id.operaciones);
        resultParcial = (TextView) findViewById(R.id.resultParcial);
    }

    /**
     * Método que realiza las operaciones
     */
    public void igual() {

        firstNum = false;
       // num1 = num1 * coef1;
        //num2 = num2 * coef2;

        System.out.println("num1: " + num1 + " num2: " + num2 + " coef1: " + coef1 + " coef2: " + coef2);
        switch (selectOp) {
            /**Division*/
            case 1:
                numAux = num1 / num2;
                resultParcial.setText(numAux.toString());
                break;
            /**Multiplicacion*/
            case 2:
                numAux = num1 * num2;
                resultParcial.setText(numAux.toString());
                break;
            /**Resta*/
            case 3:
                numAux = num1 - num2;
                resultParcial.setText(numAux.toString());
                break;
            /**Suma*/
            case 4:
                numAux = num1 + num2;
                resultParcial.setText(numAux.toString());
                break;

        }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            /** BOTÓN CERO
             * Evalua la varible "firstNum" la cual define si escribimos el primer o el segundo número
             * Concatena en la variable "aux" para construir número de más de una cifra*/
            case R.id.button0:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
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
            /** BOTÓN UNO
             * Evalua la varible "firstNum" la cual define si escribimos el primer o el segundo número
             * Concatena en la variable "aux" para construir número de más de una cifra*/
            case R.id.button1:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
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
            /** BOTÓN DOS
             * Evalua la varible "firstNum" la cual define si escribimos el primer o el segundo número
             * Concatena en la variable "aux" para construir número de más de una cifra*/
            case R.id.button2:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                operaciones.setText(op + "2");
                aux = aux.concat("2");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            /** BOTÓN TRES
             * Evalua la varible "firstNum" la cual define si escribimos el primer o el segundo número
             * Concatena en la variable "aux" para construir número de más de una cifra*/
            case R.id.button3:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                operaciones.setText(op + "3");
                aux = aux.concat("3");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            /** BOTÓN CUATRO
             * Evalua la varible "firstNum" la cual define si escribimos el primer o el segundo número
             * Concatena en la variable "aux" para construir número de más de una cifra*/
            case R.id.button4:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                operaciones.setText(op + "4");
                aux = aux.concat("4");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            /** BOTÓN CINCO
             * Evalua la varible "firstNum" la cual define si escribimos el primer o el segundo número
             * Concatena en la variable "aux" para construir número de más de una cifra*/
            case R.id.button5:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                operaciones.setText(op + "5");
                aux = aux.concat("5");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            /** BOTÓN SEIS
             * Evalua la varible "firstNum" la cual define si escribimos el primer o el segundo número
             * Concatena en la variable "aux" para construir número de más de una cifra*/
            case R.id.button6:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                operaciones.setText(op + "6");
                aux = aux.concat("6");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            /** BOTÓN SIETE
             * Evalua la varible "firstNum" la cual define si escribimos el primer o el segundo número
             * Concatena en la variable "aux" para construir número de más de una cifra*/
            case R.id.button7:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                operaciones.setText(op + "7");
                aux = aux.concat("7");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            /**BOTÓN OCHO
             *Evalua la varible "firstNum" la cual define si escribimos el primer o el segundo número
             *Concatena en la variable "aux" para construir número de más de una cifra*/
            case R.id.button8:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                operaciones.setText(op + "8");
                aux = aux.concat("8");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;
            /** BOTÓN NUEVE
             * Evalua la varible "firstNum" la cual define si escribimos el primer o el segundo número
             * Concatena en la variable "aux" para construir número de más de una cifra*/
            case R.id.button9:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                operaciones.setText(op + "9");
                aux = aux.concat("9");
                if (firstNum) {
                    num1 = Float.parseFloat(aux);
                } else {
                    num2 = Float.parseFloat(aux);
                    igual();
                }

                break;

            /** BOTÓN PUNTO*/
            case R.id.buttonDot:
                /**"op" tiene el valor de lo que está actualmente escrito en la calculadora*/
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                /**Si no hay nada escrito, pone un 0 delante del punto */
                if (op.length() == 0) {
                    operaciones.setText(op + "0.");
                    aux = aux.concat("0.");
                    firstNum = true;
                    firstDot = false;
                    /**Si el último carácter es un símbolo añade un 0 delante del punto*/
                } else if (op.charAt(op.length() - 1) == '+' || op.charAt(op.length() - 1) == '-' || op.charAt(op.length() - 1) == '/' || op.charAt(op.length() - 1) == '*') {
                    operaciones.setText(op + "0.");
                    aux = aux.concat("0.");
                    firstDot = false;
                    /**Si el anterior caracter es un punto advierte al usuario de que no puede poner dos puntos */
                } else if (op.charAt(op.length() - 1) == '.' || !firstDot) {
                    text = "No puedes poner 2 puntos decimales ";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                    /**Si pasa los filtros anteriores se pone el punto decimal*/
                } else {
                    operaciones.setText(op + ".");
                    aux = aux.concat(".");
                    firstDot = false;

                }

                break;
            /** BOTÓN DIVISIÓN*/
            case R.id.buttonDiv:
                /** "op" tiene el valor de lo que está actualmente escrito en la calculadora*/
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }

                if (op.length() == 0) {
                    /** Si no hay nada escrito, pone un 0 delante del símbolo de división*/
                    selectOp = 1;
                    operaciones.setText(op + "0/");
                    num1 = 0f;
                    firstNum = false;
                } else if (op.charAt(op.length() - 1) == '/') {
                    /** Si el anterior caracter es '/' advierte al usuario de que no puede poner dos '/' seguidos */
                    text = "No puedes poner 2 divisiones seguidas ";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (op.charAt(op.length() - 1) == 'x') {
                    /**Si el anterior caracter es 'x' advierte al usuario de que no puede poner '/' tras 'x' sin numeros por el medio */
                    text = "No puedes poner una división tras una multiplicación ";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (op.charAt(op.length() - 1) == '.') {
                    /**Si el anterior caracter es '.' advierte al usuario de que no puede poner '/' tras '.' sin numeros por el medio */
                    text = "No puedes poner una división tras un punto ";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (op.charAt(op.length() - 1) == '+') {
                    /** Si el anterior caracter es '+' advierte al usuario de que no puede poner '/' tras '+' sin numeros por el medio */
                    text = "No puedes poner una división tras una suma";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (op.charAt(op.length() - 1) == '-') {
                    /** Si el anterior caracter es '-' advierte al usuario de que no puede poner '/' tras '-' sin numeros por el medio */
                    text = "No puedes poner una división tras una resta";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (firstNum) {
                    /**Si es el primer número:
                     *Cambia el valor de 'selectOp' a 1
                     *Cambia la varible 'firstNum' a false indicando que el siguiente número es el divisor
                     *Cambia la variable 'firstDot' a true   indicando que el siguiente número puede contener un punto decimal*/
                    firstDot = true;
                    selectOp = 1;
                    operaciones.setText(op + "/");
                    firstNum = false;
                    /**Si es el segundo número:
                     *Cambia el valor de 'selectOp' a 1
                     *Asigna el valor de 'numAux' a 'num1' y a 'numAux' le asigna 0
                     *Cambia la variable 'firstDot' a true   indicando que el siguiente número puede contener un punto decimal
                     *Concatena '/' al TextView 'operaciones'*/
                } else {
                    firstDot = true;
                    selectOp = 1;
                    num1 = numAux;
                    numAux = 0f;
                    operaciones.setText(op + "/");
                }
                aux = "";

                break;
            /** BOTÓN MULTIPLICACIÓN*/
            case R.id.buttonMult:
                /** "op" tiene el valor de lo que está actualmente escrito en la calculadora*/
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1,op.length()-1);
                }
                /** Si no hay nada escrito, pone un 0 delante del símbolo de multiplicación*/
                if (op.length() == 0) {
                    selectOp = 2;
                    operaciones.setText(op + "0x");
                    num1 = 0f;
                    firstNum = false;
                } else if (op.charAt(op.length() - 1) == 'x') {
                    /** Si el anterior caracter es 'x' advierte al usuario de que no puede poner dos 'x' seguidos */
                    text = "No puedes poner 2 multiplicaciones seguidas ";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (op.charAt(op.length() - 1) == '/') {
                    /** Si el anterior caracter es '/' advierte al usuario de que no puede poner 'x' tras '/' sin numeros por el medio */
                    text = "No puedes poner una multiplicación tras una división ";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (op.charAt(op.length() - 1) == '.') {
                    /** Si el anterior caracter es '.' advierte al usuario de que no puede poner 'x' tras '.' sin numeros por el medio */
                    text = "No puedes poner una multiplicación tras un punto ";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (op.charAt(op.length() - 1) == '+') {
                    /** Si el anterior caracter es '+' advierte al usuario de que no puede poner 'x' tras '+' sin numeros por el medio */
                    text = "No puedes poner una multiplicación tras una suma";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (op.charAt(op.length() - 1) == '-') {
                    /** Si el anterior caracter es '-' advierte al usuario de que no puede poner 'x' tras '-' sin numeros por el medio */
                    text = "No puedes poner una multiplicación tras una resta";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (firstNum) {
                    /** Si es el primer número:
                     *Cambia el valor de 'selectOp' a 2
                     *Cambia la varible 'firstNum' a false indicando que el siguiente input es parte del segundo número
                     *Cambia la variable 'firstDot' a true   indicando que el siguiente número puede contener un punto decimal*/
                    firstDot = true;
                    selectOp = 2;
                    operaciones.setText(op + "x");
                    firstNum = false;
                    /** Si es el segundo número:
                     *Cambia el valor de 'selectOp' a 2
                     *Asigna el valor de 'numAux' a 'num1' y a 'numAux' le asigna 0
                     *Cambia la variable 'firstDot' a true   indicando que el siguiente número puede contener un punto decimal
                     *Concatena 'x' al TextView 'operaciones'*/
                } else {
                    firstDot = true;
                    selectOp = 2;
                    num1 = numAux;
                    numAux = 0f;
                    operaciones.setText(op + "x");
                }
                aux = "";

                break;

            /** BOTÓN RESTA*/
            case R.id.buttonRest:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                /**llama al método evStr() que evalua el string
                 * y decide si es o no un '-' operación o un '-' signo */
                if (op.length() == 0) {
                    selectOp = 3;
                    operaciones.setText(op + "0-");
                    num1 = 0f;
                    firstNum = false;
                } else if (op.charAt(op.length() - 1) == '.') {
                    text = "No puedes poner una resta tras un punto ";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (evStr()) {
                    selectOp = 3;
                    operaciones.setText(op + "-");
                    firstDot = true;
                    if (!firstNum) {
                        num1 = numAux;
                        numAux = 0f;
                    } else {
                        firstNum = false;
                    }
                } else {
                    operaciones.setText(op + "-");
                    firstDot = true;
                    if (firstNum) {
                        num1 = num1*-1;
                    } else {
                        num2 = num2*-1;

                    }

                }
                aux = "";


                break;
            /** BOTÓN SUMA*/
            case R.id.buttonSum:
                op = operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                /**llama al método evStr() que evalua el string
                 * y decide si es o no un '+' operación o un '+' signo */
                if (op.length() == 0) {
                    selectOp = 4;
                    operaciones.setText(op + "0+");
                    num1 = 0f;
                    firstNum = false;

                } else if (op.charAt(op.length() - 1) == '.') {
                    text = "No puedes poner una suma tras un punto ";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (op.charAt(op.length() - 1) == '/') {
                    /** Si el anterior caracter es '/' advierte al usuario de que no puede poner '+' tras '/' sin numeros por el medio */
                    text = "No puedes poner una suma tras una división";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (op.charAt(op.length() - 1) == 'x') {
                    /**Si el anterior caracter es 'x' advierte al usuario de que no puede poner '+' tras 'x' sin numeros por el medio */
                    text = "No puedes poner una suma tras una multiplicación ";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else if (evStr()) {
                    selectOp = 4;
                    operaciones.setText(op + "+");
                    firstDot = true;
                    if (firstNum) {
                        firstNum = false;
                    } else {

                        num1 = numAux;
                        numAux = 0f;
                    }
                } else {
                    operaciones.setText(op + "+");
                }
                aux = "";

                break;
            /** BOTÓN IGUAL */
            case R.id.buttonEq:
                /** Si  el resultado parcial no existe,
                 * es que no hay ninguna operación por lo que funciona
                 * como el botón de borrar,
                 * si hay algún resultado lo traslada al cuadro de texto pricipal.
                 * Iguala el "num1" al "numAux"
                 * Iguala la cadena "aux" a "num1"
                 * Iguala las demás variables a su valor inicial */
                if (resultParcial.length() == 0) {
                    selectOp = 0;
                    op = "";
                    operaciones.setText("");
                    aux = "";
                    firstNum = true;
                    resultParcial.setText("");
                    num1 = num2 = numAux = 0f;
                    coef1 = coef2 = 1;
                    firstDot = true;
                }
                operaciones.setText(resultParcial.getText().toString());

                num1 = numAux;
                aux = num1.toString();
                System.out.println(num1);
                numAux = 0f;

                resultParcial.setText("");
                firstNum = true;
                op = "";
                coef1 = coef2 = 1;
                break;
            /** BOTÓN BORRAR_TODO
             * Iguala todas las variable utilizadas a lo largo del programa a sus valores iniciales*/
            case R.id.buttonClear:
                selectOp = 0;
                op = "";
                operaciones.setText("");
                aux = "";
                firstNum = true;
                resultParcial.setText("");
                num1 = num2 = numAux = 0f;
                coef1 = coef2 = 1;
                firstDot = true;

                break;
            /** BOTÓN BORRAR PARCIAL*/
            case R.id.buttonClearParc:


                break;
            /** BOTÓN CAMBIO DE SIGNO
             * Si es el primer número cambia el signo del número y lo reescribe
             * Si no es el primero, evalua el último índice de cada uno de los signos para encontrar
             * el último y saber qué número tiene que cambiar de signo en la cadena "op" */
            case R.id.buttonPlusMin:
                op=operaciones.getText().toString();
                if(op.length()>13){
                    op=op.substring(1);
                }
                /** Si el último dígito no es un número advierte mediante toast de que esa acción no se puede realizar*/
                if (Character.isDigit(op.charAt(op.length() - 1))) {

                    if (firstNum) {
                        num1 = num1*-1;
                        operaciones.setText(num1.toString());
                        aux = num1.toString();
                    } else {
                        op = operaciones.getText().toString();
                        n1 = op.lastIndexOf("/") + 1;
                        n2 = op.lastIndexOf("x") + 1;
                        n3 = op.lastIndexOf("-") + 1;
                        n4 = op.lastIndexOf("+") + 1;
                        compare(n1, n2, n3, n4);
                        aux = op.substring(0, compare(n1, n2, n3, n4));
                        /** Evalua el segundo número "num2"
                         * Si "num2" es menor que 0 entonces elimina un signo de la cadena "aux"
                         * antes de invertir el signo  */
                        if (evNum2()) {
                            System.out.println(aux);
                            aux = aux.substring(0, aux.length() - 1);
                            System.out.println(aux);
                        }
                        num2 = num2 * -1;
                        System.out.println(num2);
                        operaciones.setText(aux + num2.toString());
                        aux = num2.toString();
                        igual();

                    }

                } else {
                    text = "No puedes cambiar el signo a una operación ";
                    toast = Toast.makeText(context, text, duration);
                    toast.show();
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

    public Boolean evNum2() {
        return num2 < 0;
    }

    public Boolean evNum1() {
        return num1 < 0;
    }

    public Boolean evStr() {
        String temp = operaciones.getText().toString();

        if (temp.length() == 0) {
            return false;
        } else {
            System.out.println(temp.charAt(temp.length() - 1));
            return Character.isDigit(temp.charAt(temp.length() - 1));
        }
    }

}