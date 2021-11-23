package com.tencentcloudapi.dts.v20180330;
public enum DtsErrorCode {
    // 禁止该操作。
     FAILEDOPERATION_NOTALLOWOPERATION("FailedOperation.NotAllowOperation"),
     
    // 任务开始失败。
     FAILEDOPERATION_STARTJOBFAILED("FailedOperation.StartJobFailed"),
     
    // 当前状态冲突，不能执行该操作。
     FAILEDOPERATION_STATUSINCONFLICT("FailedOperation.StatusInConflict"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 添加异步任务失败。
     INTERNALERROR_ADDTASKERROR("InternalError.AddTaskError"),
     
    // cgw系统错误。
     INTERNALERROR_CGWSYSTEMERROR("InternalError.CgwSystemError"),
     
    // 迁移平台数据库访问失败。
     INTERNALERROR_DATABASEERROR("InternalError.DatabaseError"),
     
    // 迁移任务冲突。
     INTERNALERROR_DUPLICATEJOB("InternalError.DuplicateJob"),
     
    // 锁冲突。
     INTERNALERROR_LOCKERROR("InternalError.LockError"),
     
    // 通信协议错误。
     INTERNALERROR_PROTOCOLERROR("InternalError.ProtocolError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 实例不存在。
     INVALIDPARAMETER_INSTANCENOTFOUND("InvalidParameter.InstanceNotFound"),
     
    // 参数值错误。
     INVALIDPARAMETERVALUE_INVALIDPARAMETERVALUE("InvalidParameterValue.InvalidParameterValue"),
     
    // 闲置迁移任务数目超过限制。
     LIMITEXCEEDED_MAXUNUSEDJOBS("LimitExceeded.MaxUnusedJobs"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // 该操作不能执行。
     OPERATIONDENIED_OPERATIONDENIED("OperationDenied.OperationDenied"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // 迁移任务不存在。
     RESOURCENOTFOUND_JOBNOTEXIST("ResourceNotFound.JobNotExist"),
     
    // 实例未找到。
     RESOURCENOTFOUND_RESOURCENOTFOUND("ResourceNotFound.ResourceNotFound"),
     
    // 认证失败，没有足够权限。
     UNAUTHORIZEDOPERATION_NOTENOUGHPRIVILEGES("UnauthorizedOperation.NotEnoughPrivileges"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private DtsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

