package com.common.java.exception.base.business;

/**
 * <b><code>BusinessExceptionAssertResponseEnum</code></b>
 * <p/>
 * 业务异常断言响应枚举
 * <p/>
 * <b>Creation Time:</b> 2022/8/24 下午12:19.
 *
 * @author yang xiong
 */
public enum CommonResponseEnum implements ICommonExceptionFactory {

    THROW_EXCEPTION(1000010, "{0}"),

    /**
     * Continue
     * 继续
      */
    CONTINUE(1000000, null),

    /**
     * Switching Protocols
     * 切换协议
      */
    SWITCHING_PROTOCOLS(1010000, null),

    /**
     * Processing
      */
    PROCESSING(1020000, null),

    /**
     * Checkpoint
      */
    CHECKPOINT(1030000, null),

    /**
     * OK
     * 请求已完成
      */
    OK(2000000, null),

    /**
     * Created
      */
    CREATED(2010000, null),

    /**
     * Accepted
     * 已接受
      */
    ACCEPTED(2020000, null),

    /**
     * Non-Authoritative Information
      */
    NON_AUTHORITATIVE_INFORMATION(2030000, null),

    /**
     * No Content
      */
    NO_CONTENT(2040000, null),

    /**
     * Reset Content
      */
    RESET_CONTENT(2050000, null),

    /**
     * Partial Content
      */
    PARTIAL_CONTENT(2060000, null),

    /**
     * Multi-Status
      */
    MULTI_STATUS(2070000, null),

    /**
     * Already Reported
      */
    ALREADY_REPORTED(2080000, null),

    /**
     * IM Used
      */
    IM_USED(2260000, null),

    /**
     * Multiple Choices
     * 多种选择
      */
    MULTIPLE_CHOICES(3000000, null),

    /**
     * Moved Permanently
     * 永久移动
      */
    MOVED_PERMANENTLY(3010000, null),

    /**
     * Found
     * 已找到
      */
    FOUND(3020000, null),

    /**
     * See Other
     * 查看其他位置
      */
    SEE_OTHER(3030000, null),

    /**
     * Not Modified
     * 未修改
      */
    NOT_MODIFIED(3040000, null),

    /**
     * Temporary Redirect
     * 临时重定向
      */
    TEMPORARY_REDIRECT(3070000, null),

    /**
     * Permanent Redirect
     * 永久重定向
      */
    PERMANENT_REDIRECT(3080000, null),

    /**
     * Bad Request
     * 错误请求
      */
    BAD_REQUEST(4000000, null),

    /**
     * 参数异常
     */
    ARGUE_ERROR(4000010, "参数异常：{0}"),

    /**
     * 参数校验异常
     */
    ARGUE_VALID_ERROR(4000011, null),

    /**
     * 参数绑定异常
     */
    ARGUE_BINDING_ERROR(4000012, null),

    /**
     * Unauthorized
     * 未授权
      */
    UNAUTHORIZED(4010000, null),

    /**
     * Payment Required
     * 需要付款
      */
    PAYMENT_REQUIRED(4020000, null),

    /**
     * Forbidden
     * 已禁止
      */
    FORBIDDEN(4030000, null),

    /**
     * Not Found
     * 未找到
      */
    NOT_FOUND(4040000, null),

    /**
     * 未找到文件
     */
    FILE_NOT_FOUND(4040010, "未找到文件:{0}."),

    /**
     * 未找到文件
     */
    FILE_NOT_FOUND_IN_DIR(4040011, "在目录:{0},未找到文件:{1}."),

    /**
     * Method Not Allowed
     * 方法禁用
      */
    METHOD_NOT_ALLOWED(4050000, null),

    /**
     * Not Acceptable
     * 不接受
     */
    NOT_ACCEPTABLE(4060000, null),

    /**
     * Proxy Authentication Required
     * 需要代理授权
     */
    PROXY_AUTHENTICATION_REQUIRED(4070000, null),

    /**
     * Request Timeout
     * 请求超时
     */
    REQUEST_TIMEOUT(4080000, null),

    /**
     * Conflict
     * 冲突
     */
    CONFLICT(4090000, null),

    /**
     * Gone
     */
    GONE(4100000, null),

    /**
     * Length Required
     * 需要有效长度
     */
    LENGTH_REQUIRED(4110000, null),

    /**
     * Precondition Failed
     * 未满足前提条件
     */
    PRECONDITION_FAILED(4120000, null),

    /**
     * Payload Too Large
     * 请求实体过大
     */
    PAYLOAD_TOO_LARGE(4130000, null),

    /**
     * URI Too Long
     * 请求的URL过长
     */
    URI_TOO_LONG(4140000, null),

    /**
     * Unsupported Media Type
     * 不支持的媒体类型
     */
    UNSUPPORTED_MEDIA_TYPE(4150000, null),

    /**
     * Requested range not satisfiable
     * 请求范围不符合要求
     */
    REQUESTED_RANGE_NOT_SATISFIABLE(4160000, null),

    /**
     * Expectation Failed
     * 未满足期望值
     */
    EXPECTATION_FAILED(4170000, null),

    /**
     * I'm a teapot
     */
    I_AM_A_TEAPOT(4180000, null),

    /**
     * Unprocessable Entity
     */
    UNPROCESSABLE_ENTITY(4220000, null),

    /**
     * Locked
     */
    LOCKED(4230000, null),

    /**
     * Failed Dependency
     */
    FAILED_DEPENDENCY(4240000, null),

    /**
     * Too Early
     */
    TOO_EARLY(4250000, null),

    /**
     * Upgrade Required
     */
    UPGRADE_REQUIRED(4260000, null),

    /**
     * Precondition Required
     */
    PRECONDITION_REQUIRED(4280000, null),

    /**
     * Too Many Requests
     */
    TOO_MANY_REQUESTS(4290000, null),

    /**
     * Request Header Fields Too Large
     */
    REQUEST_HEADER_FIELDS_TOO_LARGE(4310000, null),

    /**
     * Unavailable For Legal Reasons
     */
    UNAVAILABLE_FOR_LEGAL_REASONS(4510000, null),

    /**
     * Internal Server Error
     * 服务器内部错误
     */
    INTERNAL_SERVER_ERROR(5000000, null),

    /**
     * Not Implemented
     * 尚未实现
     */
    NOT_IMPLEMENTED(5010000, null),

    /**
     * Bad Gateway
     * 错误网关
     */
    BAD_GATEWAY(5020000, null),

    /**
     * Service Unavailable
     * 服务不可用
     */
    SERVICE_UNAVAILABLE(5030000, null),

    /**
     * Gateway Timeout
     * 网关超时
     */
    GATEWAY_TIMEOUT(5040000, null),

    /**
     * HTTP Version not supported
     * 不支持HTTP版本
     */
    HTTP_VERSION_NOT_SUPPORTED(5050000, null),

    /**
     * Variant Also Negotiates
     */
    VARIANT_ALSO_NEGOTIATES(5060000, null),

    /**
     * Insufficient Storage
     */
    INSUFFICIENT_STORAGE(5070000, null),

    /**
     * Loop Detected
     */
    LOOP_DETECTED(5080000, null),

    /**
     * Bandwidth Limit Exceeded
     */
    BANDWIDTH_LIMIT_EXCEEDED(5090000, null),

    /**
     * Not Extended
     */
    NOT_EXTENDED(5100000, null),

    /**
     * Network Authentication Required
      */
    NETWORK_AUTHENTICATION_REQUIRED(5110000, null);

    /**
     * 返回码
      */
    private int code;

    /**
     * 返回消息
      */
    private String message;

    CommonResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

