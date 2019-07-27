package com.aliyu010.uchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;


public class MessageActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private List<Message> messages;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        mRecyclerView = findViewById(R.id.message_recycler);


        //firebase


        messages = new ArrayList<>();

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        upateUI();


    }

    private void upateUI() {

        Message message;
        for (int i = 0; i < 50; i++) {

            message = new Message();


            message.setMessag("message " + i);
            message.setName("name " + i);

            messages.add(message);

        }

        MessageViewAdapter adapter = new MessageViewAdapter(this, messages);
        mRecyclerView.setAdapter(adapter);

    }

    private class MessageViewAdapter extends RecyclerView.Adapter<MessageViewAdapter.MessageViewHolder> {


        private List<Message> mMessages;
        private LayoutInflater mInflater;


        public MessageViewAdapter(Context context, List<Message> messages) {
            mInflater = LayoutInflater.from(context);
            mMessages = messages;
        }

        @NonNull
        @Override
        public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

            View view = mInflater.inflate(R.layout.list_message_view, viewGroup, false);
            return new MessageViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MessageViewHolder messageViewHolder, int i) {
            Message message = mMessages.get(i);
            messageViewHolder.mName.setText(message.getName());
            messageViewHolder.mMessage.setText(message.getMessag());


        }

        @Override
        public int getItemCount() {
            return messages.size();
        }

        private class MessageViewHolder extends RecyclerView.ViewHolder {
            private TextView mMessage;
            private TextView mName;
            private Button mSendMessage;
            private ImageView mFilePicker;
            private EditText mInputMessage;


            public MessageViewHolder(@NonNull View itemView) {
                super(itemView);

                mMessage = itemView.findViewById(R.id.message);
                mName = itemView.findViewById(R.id.reg_no);
            }
        }
    }


}
