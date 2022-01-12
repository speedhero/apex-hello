package com.apex.ams.helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *服务方法
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: helloworld.proto")
public final class HelloworldServiceGrpc {

  private HelloworldServiceGrpc() {}

  public static final String SERVICE_NAME = "first.demo.HelloworldService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.apex.ams.helloworld.HelloRequest,
      com.apex.ams.helloworld.HelloResponse> getFirstServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "firstService",
      requestType = com.apex.ams.helloworld.HelloRequest.class,
      responseType = com.apex.ams.helloworld.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.apex.ams.helloworld.HelloRequest,
      com.apex.ams.helloworld.HelloResponse> getFirstServiceMethod() {
    io.grpc.MethodDescriptor<com.apex.ams.helloworld.HelloRequest, com.apex.ams.helloworld.HelloResponse> getFirstServiceMethod;
    if ((getFirstServiceMethod = HelloworldServiceGrpc.getFirstServiceMethod) == null) {
      synchronized (HelloworldServiceGrpc.class) {
        if ((getFirstServiceMethod = HelloworldServiceGrpc.getFirstServiceMethod) == null) {
          HelloworldServiceGrpc.getFirstServiceMethod = getFirstServiceMethod = 
              io.grpc.MethodDescriptor.<com.apex.ams.helloworld.HelloRequest, com.apex.ams.helloworld.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "first.demo.HelloworldService", "firstService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apex.ams.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.apex.ams.helloworld.HelloResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HelloworldServiceMethodDescriptorSupplier("firstService"))
                  .build();
          }
        }
     }
     return getFirstServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloworldServiceStub newStub(io.grpc.Channel channel) {
    return new HelloworldServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloworldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HelloworldServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloworldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HelloworldServiceFutureStub(channel);
  }

  /**
   * <pre>
   *服务方法
   * </pre>
   */
  public static abstract class HelloworldServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void firstService(com.apex.ams.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<com.apex.ams.helloworld.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFirstServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFirstServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.apex.ams.helloworld.HelloRequest,
                com.apex.ams.helloworld.HelloResponse>(
                  this, METHODID_FIRST_SERVICE)))
          .build();
    }
  }

  /**
   * <pre>
   *服务方法
   * </pre>
   */
  public static final class HelloworldServiceStub extends io.grpc.stub.AbstractStub<HelloworldServiceStub> {
    private HelloworldServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloworldServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloworldServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloworldServiceStub(channel, callOptions);
    }

    /**
     */
    public void firstService(com.apex.ams.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<com.apex.ams.helloworld.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFirstServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *服务方法
   * </pre>
   */
  public static final class HelloworldServiceBlockingStub extends io.grpc.stub.AbstractStub<HelloworldServiceBlockingStub> {
    private HelloworldServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloworldServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloworldServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloworldServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.apex.ams.helloworld.HelloResponse firstService(com.apex.ams.helloworld.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getFirstServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *服务方法
   * </pre>
   */
  public static final class HelloworldServiceFutureStub extends io.grpc.stub.AbstractStub<HelloworldServiceFutureStub> {
    private HelloworldServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HelloworldServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloworldServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HelloworldServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.apex.ams.helloworld.HelloResponse> firstService(
        com.apex.ams.helloworld.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getFirstServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIRST_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloworldServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloworldServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIRST_SERVICE:
          serviceImpl.firstService((com.apex.ams.helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.apex.ams.helloworld.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloworldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloworldServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.apex.ams.helloworld.Helloworld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloworldService");
    }
  }

  private static final class HelloworldServiceFileDescriptorSupplier
      extends HelloworldServiceBaseDescriptorSupplier {
    HelloworldServiceFileDescriptorSupplier() {}
  }

  private static final class HelloworldServiceMethodDescriptorSupplier
      extends HelloworldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloworldServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloworldServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloworldServiceFileDescriptorSupplier())
              .addMethod(getFirstServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
