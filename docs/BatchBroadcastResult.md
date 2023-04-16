

# BatchBroadcastResult

Batch broadcast result
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**known** | **List&lt;String&gt;** | Already known transactions detected during processing (if there are any) |  [optional]
**evicted** | **List&lt;String&gt;** | Transactions accepted by the mempool and then evicted due to insufficient fee (if there are any) |  [optional]
**invalid** | [**List&lt;InvalidBroadCast&gt;**](InvalidBroadCast.md) | Transactions that failed to be accepted by the mempool (if there are any) |  [optional]



