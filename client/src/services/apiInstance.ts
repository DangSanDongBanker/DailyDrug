import axios from "axios";

const apiInstance = axios.create({
  baseURL: `${process.env.REACT_APP_API_ADDRESS}/`,
  timeout: 1000,
  withCredentials: true,
  headers: { "Content-Type": "application/json" },
});

export default apiInstance;

// export async function fetchUserInfo() {
//   try {
//     const response = await apiClient.get("/auth/user");
//     const userInfo = await response?.data;
//     return userInfo;
//   } catch (error) {
//     throw error;
//   }
// }

// export function fetchLoginKakao(): string {
//   const redirectUri = `${process.env.REACT_APP_API_ADDRESS}/api/auth/kakao`;
//   const clientId = process.env.REACT_APP_KAKAO_CLIENT_ID;
//   const kakaoURL = `https://kauth.kakao.com/oauth/authorize?client_id=${clientId}&redirect_uri=${redirectUri}&response_type=code`;

//   return kakaoURL;
// }
