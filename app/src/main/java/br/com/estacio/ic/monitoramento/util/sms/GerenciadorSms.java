package br.com.estacio.ic.monitoramento.util.sms;

import android.telephony.SmsManager;

/**
 * Created by jluca on 09/05/2016.
 */
public class GerenciadorSms {
    private SmsManager smsManager;

    public GerenciadorSms() {
        smsManager = SmsManager.getDefault();
    }

}
