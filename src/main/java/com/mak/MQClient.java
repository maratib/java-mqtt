package com.mak;

import org.eclipse.paho.mqttv5.client.IMqttToken;
import org.eclipse.paho.mqttv5.client.MqttCallback;
import org.eclipse.paho.mqttv5.client.MqttClient;
import org.eclipse.paho.mqttv5.client.MqttConnectionOptions;
import org.eclipse.paho.mqttv5.client.MqttDisconnectResponse;
import org.eclipse.paho.mqttv5.common.MqttException;
import org.eclipse.paho.mqttv5.common.MqttMessage;
import org.eclipse.paho.mqttv5.common.packet.MqttProperties;

public class MQClient implements MqttCallback {

  private static final String broker = "tcp://broker.emqx.io:1883";
  private static final String clientId = "demo_client";
  // private static final String clientId = MqttClient.
  private static final String userName = "emqx";
  private static final String password = "public";
  private static final boolean cleanSession = true;

  MqttClient mqttClient;

  public MQClient() {
    try {
      mqttClient = new MqttClient(broker, clientId, );
      MqttConnectionOptions options = new MqttConnectionOptions();
      options.mqttClient.connect(options);

      if (mqttClient.isConnected()) {
        System.out.println("Connected");
      } else {
        System.out.println("Faild to connect ...");
      }

    } catch (MqttException e) {
      e.printStackTrace();
    }

  }

  @Override
  public void disconnected(MqttDisconnectResponse disconnectResponse) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'disconnected'");
  }

  @Override
  public void mqttErrorOccurred(MqttException exception) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mqttErrorOccurred'");
  }

  @Override
  public void messageArrived(String topic, MqttMessage message) throws Exception {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'messageArrived'");
  }

  @Override
  public void deliveryComplete(IMqttToken token) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deliveryComplete'");
  }

  @Override
  public void connectComplete(boolean reconnect, String serverURI) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'connectComplete'");
  }

  @Override
  public void authPacketArrived(int reasonCode, MqttProperties properties) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'authPacketArrived'");
  }

}
