import React from 'react';
import styled from 'styled-components';
import { FiPlusSquare } from "react-icons/fi";

const FormBox = styled.form`
    display: flex;
    height: 50px;

    input{
        flex-grow: 1; /* 꽉 채우는 값 */
        border-color: #000;
        padding: 0 10px;
    }

    button{
        width: 50px;
        background: #000;
        color: #fff;
        border: 0;
        cursor: pointer;

        svg{
            font-size: 2.5rem;
        }
    }
`;

const TodoForm = () => {
  return (
    <FormBox autoComplete='off'>
        <input type="text"/>
        <button type="button"><FiPlusSquare /></button>
    </FormBox>
  );
};

export default React.memo(TodoForm);
