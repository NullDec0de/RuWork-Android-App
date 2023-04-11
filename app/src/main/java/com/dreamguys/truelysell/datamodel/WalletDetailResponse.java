package com.dreamguys.truelysell.datamodel;

public class WalletDetailResponse {
    private Data data;

    private Response response;

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    public Response getResponse ()
    {
        return response;
    }

    public void setResponse (Response response)
    {
        this.response = response;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+", response = "+response+"]";
    }




    public class Data
    {
        private String transaction_id;

        private String reason;

        private String service_title;

        private String amount;

        private String paid_status;

        private String exchange_rate;

        private String bs_currency_code;

        private String credit_wallet;

        private String created_at;

        private String mobileno;

        private String debit_wallet;

        private String providername;

        private String currency_code;

        private String net_amt;

        private String total_amt;

        private String current_wallet;

        private String amount_refund;

        private String service_date;

        private String charge_id;

        private String provider_id;

        private String location;

        private String email;

        private String fee_amt;

        private String username;

        public String getTransaction_id ()
        {
            return transaction_id;
        }

        public void setTransaction_id (String transaction_id)
        {
            this.transaction_id = transaction_id;
        }

        public String getReason ()
        {
            return reason;
        }

        public void setReason (String reason)
        {
            this.reason = reason;
        }

        public String getService_title ()
        {
            return service_title;
        }

        public void setService_title (String service_title)
        {
            this.service_title = service_title;
        }

        public String getAmount ()
        {
            return amount;
        }

        public void setAmount (String amount)
        {
            this.amount = amount;
        }

        public String getPaid_status ()
        {
            return paid_status;
        }

        public void setPaid_status (String paid_status)
        {
            this.paid_status = paid_status;
        }

        public String getExchange_rate ()
        {
            return exchange_rate;
        }

        public void setExchange_rate (String exchange_rate)
        {
            this.exchange_rate = exchange_rate;
        }

        public String getBs_currency_code ()
        {
            return bs_currency_code;
        }

        public void setBs_currency_code (String bs_currency_code)
        {
            this.bs_currency_code = bs_currency_code;
        }

        public String getCredit_wallet ()
        {
            return credit_wallet;
        }

        public void setCredit_wallet (String credit_wallet)
        {
            this.credit_wallet = credit_wallet;
        }

        public String getCreated_at ()
        {
            return created_at;
        }

        public void setCreated_at (String created_at)
        {
            this.created_at = created_at;
        }

        public String getMobileno ()
        {
            return mobileno;
        }

        public void setMobileno (String mobileno)
        {
            this.mobileno = mobileno;
        }

        public String getDebit_wallet ()
        {
            return debit_wallet;
        }

        public void setDebit_wallet (String debit_wallet)
        {
            this.debit_wallet = debit_wallet;
        }

        public String getProvidername ()
        {
            return providername;
        }

        public void setProvidername (String providername)
        {
            this.providername = providername;
        }

        public String getCurrency_code ()
        {
            return currency_code;
        }

        public void setCurrency_code (String currency_code)
        {
            this.currency_code = currency_code;
        }

        public String getNet_amt ()
        {
            return net_amt;
        }

        public void setNet_amt (String net_amt)
        {
            this.net_amt = net_amt;
        }

        public String getTotal_amt ()
        {
            return total_amt;
        }

        public void setTotal_amt (String total_amt)
        {
            this.total_amt = total_amt;
        }

        public String getCurrent_wallet ()
        {
            return current_wallet;
        }

        public void setCurrent_wallet (String current_wallet)
        {
            this.current_wallet = current_wallet;
        }

        public String getAmount_refund ()
        {
            return amount_refund;
        }

        public void setAmount_refund (String amount_refund)
        {
            this.amount_refund = amount_refund;
        }

        public String getService_date ()
        {
            return service_date;
        }

        public void setService_date (String service_date)
        {
            this.service_date = service_date;
        }

        public String getCharge_id ()
        {
            return charge_id;
        }

        public void setCharge_id (String charge_id)
        {
            this.charge_id = charge_id;
        }

        public String getProvider_id ()
        {
            return provider_id;
        }

        public void setProvider_id (String provider_id)
        {
            this.provider_id = provider_id;
        }

        public String getLocation ()
        {
            return location;
        }

        public void setLocation (String location)
        {
            this.location = location;
        }

        public String getEmail ()
        {
            return email;
        }

        public void setEmail (String email)
        {
            this.email = email;
        }

        public String getFee_amt ()
        {
            return fee_amt;
        }

        public void setFee_amt (String fee_amt)
        {
            this.fee_amt = fee_amt;
        }

        public String getUsername ()
        {
            return username;
        }

        public void setUsername (String username)
        {
            this.username = username;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [transaction_id = "+transaction_id+", reason = "+reason+", service_title = "+service_title+", amount = "+amount+", paid_status = "+paid_status+", exchange_rate = "+exchange_rate+", bs_currency_code = "+bs_currency_code+", credit_wallet = "+credit_wallet+", created_at = "+created_at+", mobileno = "+mobileno+", debit_wallet = "+debit_wallet+", providername = "+providername+", currency_code = "+currency_code+", net_amt = "+net_amt+", total_amt = "+total_amt+", current_wallet = "+current_wallet+", amount_refund = "+amount_refund+", service_date = "+service_date+", charge_id = "+charge_id+", provider_id = "+provider_id+", location = "+location+", email = "+email+", fee_amt = "+fee_amt+", username = "+username+"]";
        }
    }




    public class Response
    {
        private String response_code;

        private String response_message;

        public String getResponse_code ()
        {
            return response_code;
        }

        public void setResponse_code (String response_code)
        {
            this.response_code = response_code;
        }

        public String getResponse_message ()
        {
            return response_message;
        }

        public void setResponse_message (String response_message)
        {
            this.response_message = response_message;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [response_code = "+response_code+", response_message = "+response_message+"]";
        }
    }





}
