import apiInstance from "services/apiInstance";

const productsApi = {
  getProductDetail: (id: number) => apiInstance.get(`/products/${id}`),
  getProductList: (
    category: string,
    perPage: number,
    page: number,
    orderBy: string
  ) =>
    apiInstance.get(
      `/products?product-category=${category}&product-order=${orderBy}&page-no=${page}&page-size=${perPage}`
    ),
  getWeeklyPopular: (count: number) =>
    apiInstance.get(
      `/products/weekly-popular-products?page-no=0&page-size=${count}`
    ),
};

export default productsApi;
