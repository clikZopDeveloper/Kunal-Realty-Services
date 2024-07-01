package com.example.kunal_realty_services.Model


import com.google.gson.annotations.SerializedName

data class DashboardBean(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("error")
    val error: Boolean, // false
    @SerializedName("msg")
    val msg: String // Data loaded successfully.
) {
    data class Data(
        @SerializedName("expenses")
        val expenses: List<Expense>,
        @SerializedName("sales")
        val sales: List<Sale>,
        @SerializedName("total_customer")
        val totalCustomer: TotalCustomer,
        @SerializedName("total_expense")
        val totalExpense: TotalExpense,
        @SerializedName("total_sale")
        val totalSale: TotalSale,
        @SerializedName("total_vendor")
        val totalVendor: TotalVendor
    ) {
        data class Expense(
            @SerializedName("amount")
            val amount: String, // 10.00
            @SerializedName("build")
            val build: String, // Billed
            @SerializedName("created_at")
            val createdAt: String, // 2024-05-31 18:24:50
            @SerializedName("expense_category")
            val expenseCategory: String, // Travel
            @SerializedName("expense_date")
            val expenseDate: String, // 2024-05-28
            @SerializedName("expense_subcategory")
            val expenseSubcategory: String, // Cab
            @SerializedName("expense_type")
            val expenseType: String, // Labour
            @SerializedName("expenses_for")
            val expensesFor: Any, // null
            @SerializedName("file")
            val `file`: String, // ../invoices/4918050264761121-title-(2).jpg
            @SerializedName("id")
            val id: Int, // 6
            @SerializedName("ids")
            val ids: Int, // 2
            @SerializedName("invoice_id")
            val invoiceId: Int, // 0
            @SerializedName("name")
            val name: String, // rtrt
            @SerializedName("note")
            val note: String, // xczxczxc
            @SerializedName("payment_mode")
            val paymentMode: String, // Cash
            @SerializedName("ref_no")
            val refNo: String, // 2422.1p][p]
            @SerializedName("trans_id")
            val transId: String,
            @SerializedName("updated_at")
            val updatedAt: Any, // null
            @SerializedName("user_id")
            val userId: Int, // 11
            @SerializedName("vendor_id")
            val vendorId: Int // 2
        )

        data class Sale(
            @SerializedName("company_id")
            val companyId: Int, // 1
            @SerializedName("created_at")
            val createdAt: String, // 2024-05-29 17:27:30
            @SerializedName("customer_id")
            val customerId: Int, // 2
            @SerializedName("customer_invoice")
            val customerInvoice: Int, // 0
            @SerializedName("due_date")
            val dueDate: String, // 2024-05-31
            @SerializedName("gst_type")
            val gstType: String, // Outer GST
            @SerializedName("id")
            val id: Int, // 8
            @SerializedName("invoice")
            val invoice: String, // XYZ_9
            @SerializedName("invoice_date")
            val invoiceDate: String, // 2024-05-30
            @SerializedName("is_billed")
            val isBilled: String, // Billed
            @SerializedName("payment_status")
            val paymentStatus: String, // pending
            @SerializedName("service_tax")
            val serviceTax: String, // 2024.00
            @SerializedName("updated_at")
            val updatedAt: Any, // null
            @SerializedName("user_id")
            val userId: Int // 11
        )

        data class TotalCustomer(
            @SerializedName("total_customer")
            val totalCustomer: Int // 1
        )

        data class TotalExpense(
            @SerializedName("total_expense")
            val totalExpense: String // 56.00
        )

        data class TotalSale(
            @SerializedName("total_sale")
            val totalSale: String // 0.00
        )

        data class TotalVendor(
            @SerializedName("total_vendor")
            val totalVendor: Int // 3
        )
    }
}