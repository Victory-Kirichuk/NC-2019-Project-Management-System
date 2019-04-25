package com.netcracker.victory.models;

public class StatusModel {

        private int statusId;
    private String status;

//    public StatusModel(int statusId, String status) {
//        this.statusId = statusId;
//        this.status = status;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



        public int getStatusId() {
            return statusId;
        }

        public void setStatusId(int statusId) {
            this.statusId = statusId;
        }

    }
