package frase_do_dia.mauricio.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrace;

    private String[] frases = {
            "Me inscrevi num site de namoro, mas não pus foto nem data de nascimento. nem o nome verdadeiro. Me falaram que não devemos nos expor muito na internet.",
            "Paga de santa, mas não mostra o histórico do navegador do celular.",
            "Tinder é uma espécie de iFood, só muda a finalidade.",
            "Todos os fakes que já denunciados foram criados para stalkear a vida de alguém. Reflitam.",
            "A internet seria um lugar bem melhor se as pessoas soubessem interpretar textos.",
            "A internet é a 1° maravilha da vida moderna.",
            "Quando você compra algo na internet, fica esperando o cara dos Correios como se fosse da família. É tipo 'tô perto', mas nunca diz onde está.",
            "É difícil viver no mundo onde o único amor é a internet.",
            "A pessoa usa o seu Wi-Fi e ainda reclama que a internet está lenta.",
            "Quando ligo a TV no domingo, agradeço a Deus por ter internet em casa.",
            "Aquele momento que sua internet cai, você fica nervoso e sua avó diz: \"Liga pra Embratel pra saber que aconteceu.\""
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       textoNovaFrase = (TextView) findViewById(R.id.textoNovaFrase);
       botaoNovaFrace = (Button) findViewById(R.id.botaoNovaFrase);

       botaoNovaFrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomico = new Random();
                int NAleatorio = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[NAleatorio]);
            }
        });
    }
}
