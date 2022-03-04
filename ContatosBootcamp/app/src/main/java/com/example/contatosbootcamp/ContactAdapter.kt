package com.example.contatosbootcamp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contatosbootcamp.databinding.ContactViewBinding

class ContactAdapter(private val contactsList: ArrayList<Contact>) : RecyclerView.Adapter<ContactAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactAdapter.ViewHolder {
        val binding = ContactViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        with(holder){
            with(contactsList[position]){
                binding.contactName.text = name
                binding.contactNumber.text = phoneNumber
            }
        }
    }

    override fun getItemCount(): Int = contactsList.size

    class ViewHolder(val binding: ContactViewBinding) : RecyclerView.ViewHolder(binding.root) {

    }

}