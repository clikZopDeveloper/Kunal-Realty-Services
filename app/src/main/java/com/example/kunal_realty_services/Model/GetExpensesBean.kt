package com.example.kunal_realty_services.Model


import com.google.gson.annotations.SerializedName

data class GetExpensesBean(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("error")
    val error: Boolean, // false
    @SerializedName("msg")
    val msg: String // Data loaded successfully.
) {
    data class Data(
        @SerializedName("amount")
        val amount: String, // 3.00
        @SerializedName("build")
        val build: String, // Billed
        @SerializedName("created_at")
        val createdAt: String, // 2024-05-29 17:40:01
        @SerializedName("expense_category")
        val expenseCategory: String, // Travel
        @SerializedName("expense_date")
        val expenseDate: String, // 2024-05-31
        @SerializedName("expense_subcategory")
        val expenseSubcategory: String, // Cab
        @SerializedName("expense_type")
        val expenseType: String, // Labour
        @SerializedName("expenses_for")
        val expensesFor: Any, // null
        @SerializedName("file")
        val `file`: String, // ../invoices/8463657365330150-title.jpg
        @SerializedName("id")
        val id: Int, // 4
        @SerializedName("ids")
        val ids: String, // Customer 2
        @SerializedName("invoice_id")
        val invoiceId: Int, // 0
        @SerializedName("name")
        val name: String, // jhjk
        @SerializedName("note")
        val note: String, // cvcv
        @SerializedName("payment_mode")
        val paymentMode: String, // Cash
        @SerializedName("ref_no")
        val refNo: String, // asadf
        @SerializedName("trans_id")
        val transId: String,
        @SerializedName("updated_at")
        val updatedAt: Any, // null
        @SerializedName("user")
        val user: String, // Test user
        @SerializedName("user_id")
        val userId: Int, // 11
        @SerializedName("vendor_id")
        val vendorId: Int, // 2
        @SerializedName("vendor_name")
        val vendorName: String // Labor 1
    )
}