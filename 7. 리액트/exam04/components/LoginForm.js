import React from "react";
import styled from 'styled-components';

const LoginButton = styled.button`
    
`;

const LoginForm = () => {
  return (
    <>
      <h1>로그인</h1>
      <form>
        <input type="text" name="userId" placeholder="아이디" />
        <input type="password" name="password" placeholder="비밀번호" />
        <button type="submit">로그인</button>
      </form>
    </>
  );
};
