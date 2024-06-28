//package com.example.demoSorteo.util;
//
//import com.example.demoSorteo.dto.TopicDto;
//import com.example.demoSorteo.dto.request.StudentDtoRequest;
//import com.example.demoSorteo.dto.response.StudentDtoResponse;
//import com.example.demoSorteo.dto.response.TopicDtoResponse;
//import com.example.demoSorteo.model.Student;
//import com.example.demoSorteo.model.Topic;
//import com.mercadolibre.project_be_java_w23_team2.dto.*;
//import com.mercadolibre.project_be_java_w23_team2.model.*;
//
//import java.util.List;
//import java.util.Map;
//
//import static org.springframework.util.ClassUtils.isPresent;
//
///**
// * Utility class for mapping entities to DTOs.
// */
//public class Mapper {
//
//  public static StudentDtoResponse mapStudentToStudentDtoResponse(Student student) {
//    return new StudentDtoResponse(
//            student.getName(),
//            student.getSurName(),
//            student.getDni(),
//            student.getCourse(),
//            new TopicDtoResponse(
//                    student.getTopic().getTopicName(),
//                    student.getTopic().getComplexity()
//            )
//    );
//  }
//  public static List<StudentDtoResponse> mapStudentToStudentDtoResponse(List<Student> students) {
//    return students.stream()
//            .map(Mapper::mapStudentToStudentDtoResponse)
//            .toList();
//  }
//
//  public static Student mapStudentDTOresponseToStudent(StudentDtoRequest studentDtoRequest) {
//    studentDtoRequest.getTopicDto().getId();
//
//    return new Student(
//            studentDtoRequest.getName(),
//            studentDtoRequest.getSurName(),
//            studentDtoRequest.getDni(),
//            studentDtoRequest.getCourse(),
//            new Topic(
//
//    );
//
//  }
//
//
//
//  public static TopicDtoResponse mapTopicDtoToTopicDtoResponse(TopicDto topicDto) {
//    return new TopicDtoResponse(
//            topicDto.getTopicName(),
//            topicDto.getComplexity()
//    );
//  }
//
//  public static Topic topicDtoToTopic(TopicDto topicDto) {
//    return new Topic(topicDto.getId());
//  }
//    return new ProductTypeDTO(productType.getId(), productType.getCategory());
//  }
//
//  public static UserDTO userToUserDTO(User seller) {
//    return new UserDTO(seller.getId(), seller.getUsername(), seller.getPassword(), seller.getRol());
//  }
//
//  public static ProductDTO productToProductDTO(Product product) {
//    return new ProductDTO(product.getId(), product.getName(),
//        productTypeToProductTypeDTO(product.getType()), userToUserDTO(product.getSeller()),
//        product.getPrice());
//  }
//
//  public static User userDTOToUser(UserDTO seller) {
//    return new User(seller.getId(), seller.getUsername(), seller.getPassword(), seller.getRol());
//  }
//
//  public static Product productDTOtoProduct(ProductDTO product) {
//    return new Product(product.getId(), product.getName(),
//        productTypeDTOToProductType(product.getType()), userDTOToUser(product.getSeller()),
//        product.getPrice());
//  }
//
//  public static ProductType productTypeDTOToProductType(ProductTypeDTO productType) {
//    return new ProductType(productType.getId(), productType.getCategory());
//  }
//
//  public static Batch batchStockDTOToEntity(Product product, GetBatchStockDto dto,
//      Section section) {
//    Batch batch = new Batch();
//    batch.setProduct(product);
//    batch.setInitialQuantity(dto.getInitialQuantity());
//    batch.setCurrentQuantity(dto.getCurrentQuantity());
//    batch.setDueDate(dto.getDueDate());
//    batch.setCurrentTemperature(dto.getCurrentTemperature());
//    batch.setMinimumTemperature(dto.getMinimumTemperature());
//    batch.setManufacturingDate(dto.getManufacturingDate());
//    batch.setManufacturingTime(dto.getManufacturingTime());
//    batch.setSection(section);
//
//    return batch;
//  }
//
//  public static InboundOrder GetInboundOrderDTOToEntity(GetInboundOrderDto charge, Section section,
//      List<Batch> batch) {
//    InboundOrder inboundOrder = new InboundOrder();
//    inboundOrder.setOrderDate(charge.getInboundOrderDto().getOrderDate());
//    inboundOrder.setSection(section);
//    inboundOrder.setBatchStock(batch);
//
//    return inboundOrder;
//  }
//
//  public static ProductQuantityWarehouseDto totalStockProductToDTO(int idProduct,
//      List<Map<String, Integer>> results) {
//    return new ProductQuantityWarehouseDto(idProduct, results.stream().map(
//        result -> new QuantityWarehouseDto(result.get("warehouseCode"),
//            ((Number) result.get("totalQuantity")).intValue())).toList());
//  }
//
//  public static List<ProductDTO> ProductToProductDTO(PurchaseOrder order) {
//    List<ItemDTO> itemsDto = orderToItemDTO(order);
//    return mapToProductsDTO(itemsDto);
//  }
//
//  public static List<ItemDTO> orderToItemDTO(PurchaseOrder order) {
//    return order.getItems().stream().map(
//        item -> new ItemDTO(new ProductDTO(item.getProduct().getId(), item.getProduct().getName()),
//            item.getQuantity())).toList();
//  }
//
//  public static List<ProductDTO> mapToProductsDTO(List<ItemDTO> itemsDto) {
//    return itemsDto.stream().map(ItemDTO::getProduct).toList();
//  }
//
//  public static List<Product> productCreationDTOToProducts(ProductCreationDTO products,
//      User seller) {
//    return products.getProducts().stream().map(productDTO -> {
//      Product product = new Product();
//      product.setType(productTypeDTOToProductType(productDTO.getType()));
//      product.setName(productDTO.getName());
//      product.setPrice(productDTO.getPrice());
//      product.setSeller(seller);
//      return product;
//    }).toList();
//  }
//}
